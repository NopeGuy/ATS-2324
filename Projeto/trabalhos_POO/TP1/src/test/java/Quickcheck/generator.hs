import Test.QuickCheck
import System.IO
import Data.List (intercalate, sortBy)
import Data.Ord (comparing)
import Text.Printf (printf)

data Artigo = Artigo String String Double deriving (Show)
data Encomenda = Encomenda String Int String deriving (Show)
data Utilizador = Utilizador String String String deriving (Show)
data Transportadora = Transportadora String String deriving (Show)
data Malas = Malas String Double deriving (Show)
data Sapatilhas = Sapatilhas String Double deriving (Show)
data TShirt = TShirt String Double deriving (Show)
data Vintage = Vintage String Double deriving (Show)

instance Arbitrary Artigo where
  arbitrary = do
    nome <- elements ["T-Shirt Liso", "Sapatilhas Edição Especial", "Mala de Viagem Premium"]
    categoria <- elements ["TShirt", "Sapatilhas", "Malas"]
    preco <- choose (10.0, 500.0)
    return $ Artigo nome categoria preco

instance Arbitrary Encomenda where
  arbitrary = do
    idEncomenda <- arbitraryCode 5
    quantidade <- choose (1, 10)
    dataEncomenda <- elements ["2023-01-01", "2023-02-15", "2023-03-20"]
    return $ Encomenda idEncomenda quantidade dataEncomenda

arbitraryCode :: Int -> Gen String
arbitraryCode len = vectorOf len (elements ( ['a'..'z'] ++ ['0'..'9']))

instance Arbitrary Utilizador where
  arbitrary = do
    nome <- elements ["Tiago", "Maria", "André", "Catarina", "Diogo", "Ana", "Pedro", "Sofia"]
    email <- elements ["tiago@example.com", "maria@example.com", "andre@example.com", "catarina@example.com", "diogo@example.com", "ana@example.com", "pedro@example.com", "sofia@example.com" ]
    rua <- elements ["Via Futebol Clube do Porto", "Rua A", "Rua B", "Rua C", "Rua D", "Avenida X", "Avenida Y", "Travessa Z", "Alameda W"]
    --rua <- elements <$> replicateM 4 (generateStreetName)
    numero <- elements [1..999]
    codigoPostal <- arbitraryPostalCode
    localidade <- elements ["Porto", "Lisboa", "Coimbra", "Braga", "Aveiro"]
    return $ Utilizador nome email (rua ++ " " ++ show numero ++ ", " ++ codigoPostal ++ " " ++ localidade)

arbitraryPostalCode :: Gen String
arbitraryPostalCode = do
  firstPart <- vectorOf 4 (elements ['0'..'9'])
  secondPart <- vectorOf 3 (elements ['0'..'9'])
  return $ firstPart ++ "-" ++ secondPart

instance Arbitrary Transportadora where
  arbitrary = do
    nome <- elements ["CTT", "Nacex", "DHL"]
    tipoServico <- elements ["Expresso", "Normal", "Econômico"]
    return $ Transportadora nome tipoServico

logEntry :: Gen String
logEntry = do
  artigo <- arbitrary :: Gen Artigo
  encomenda <- arbitrary :: Gen Encomenda
  utilizador <- arbitrary :: Gen Utilizador
  transportadora <- arbitrary :: Gen Transportadora
  return $ intercalate "\n" [showArtigo artigo, showEncomenda encomenda, showUtilizador utilizador, showTransportadora transportadora]

showArtigo :: Artigo -> String
showArtigo (Artigo nome categoria preco) = "Artigo: " ++ nome ++ ", Categoria: " ++ categoria ++ ", Preço: " ++ formatPrice preco

formatPrice :: Double -> String
formatPrice price = printf "%.2f" price

showEncomenda :: Encomenda -> String
showEncomenda (Encomenda idEncomenda quantidade dataEncomenda) = "Encomenda: ID=" ++ idEncomenda ++ ", Quantidade: " ++ show quantidade ++ ", Data: " ++ dataEncomenda

showUtilizador :: Utilizador -> String
showUtilizador (Utilizador nome email morada) = "Utilizador: Nome=" ++ nome ++ ", Email: " ++ email ++ ", Morada: " ++ morada

showTransportadora :: Transportadora -> String
showTransportadora (Transportadora nome tipoServico) = "Transportadora: Nome=" ++ nome ++ ", Tipo de Serviço: " ++ tipoServico

generateLog :: IO [String]
generateLog = generate $ vectorOf 1000 logEntry

saveLogToFile :: FilePath -> [String] -> IO ()
saveLogToFile path logs = withFile path WriteMode $ \handle -> do
  mapM_ (hPutStrLn handle) logs

main :: IO ()
main = do
  logs <- generateLog
  saveLogToFile "logs.txt" logs

