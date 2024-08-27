import java.io.*;


public class Main {
    public static void main(String[] args)  {

        String path = "C:\\Users\\maril\\OneDrive\\Área de Trabalho\\JavinhaS2\\santander-coders-2024-java\\aula5\\leitorArquivos\\input.txt";

        System.out.println(leArquivos(path));

    }

    public static String leArquivos(String path)  {
        BufferedReader bufferedReader = null;
        try {

            FileReader fileReader = new FileReader(path);

            bufferedReader = new BufferedReader(fileReader);
            StringBuilder text = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                text.append(line);
                text.append(System.lineSeparator());
            }
            return text.toString();

        } catch (IOException ioException){
            System.out.println("Arquivo não encontrado");
        } finally {

            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ioException){
                System.out.println("Problemas ao fechar o reader");
            }
        }

        return "";
    }
}