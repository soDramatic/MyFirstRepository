import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Marcin on 2015-12-18.
 */
public class Utils {

    public static void downloadImage(String urlImage) throws IOException {

        BufferedImage bufferedImage = null;
        try {
            URL url = new URL(urlImage);
            bufferedImage = ImageIO.read(url);
            ImageIO.write(bufferedImage, "png", new File("E://Programowanie/Images/image.png"));
        } catch (IOException e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }

    public static boolean saveHashToFile(String image) throws IOException {

        try {
            String s = Utils.md5(image.toString());
            File file = new File("E://Programowanie/Images/Hash.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            String patternStr = "([a-zA-Z0-9]+\\W{1}jpg)|([a-zA-Z0-9]+\\W{1}png)|([a-zA-Z0-9]+\\W{1}bmp)";
            image.matches(patternStr);
            Files.lines(new File("E://Programowanie/Images/Hash.txt").toPath()).filter(s1 -> !s.isEmpty()).forEach(System.out::print);
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            Utils.readFileAndComapreHash();
            bw.write(s + ",");
            bw.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String getHash(String txt, String hashType) {
        try {
            MessageDigest md = MessageDigest.getInstance(hashType);
            byte[] array = md.digest(txt.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
        }
        return null;
    }

    public static String md5(String txt) {
        return Utils.getHash(txt, "MD5");
    }


//    public static boolean readFileAndComapreHash(String hash) throws IOException {
//            File file = new File("E://Programowanie/Images/Hash.txt");
//            Scanner read = new Scanner(file);
//            StringTokenizer token;
//            while (read.hasNextLine()) {
//                token = new StringTokenizer(read.nextLine(), ",");
//                while (token.hasMoreElements()) {
//                    System.out.println("Token=" + token.nextToken());
//                    if (token.nextToken().equals(hash)) {
//                        return true;
//                    }
//                }
//        }
//        return false;
//
//    }

    public static boolean readFileAndComapreHash(String hash) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("E://Programowanie/Images/Hash.txt"));
        String line = null;
        
        while((line = br.readLine()) != null && !line.isEmpty()){
            String[] values = line.split(",");
            for(String str : values){
                System.out.println(str);
            }
        }
        br.close();
        return true;
    }
}


