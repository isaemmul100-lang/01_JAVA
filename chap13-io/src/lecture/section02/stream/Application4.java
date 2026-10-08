package lecture.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {
        /*
         * 스트림 : 자바 프로그램과 외부 데이터를 연결하는 통로 (단방향)
         *
         * - 입력스트림 : 데이터를 읽어오기 위한 스트림 ( FileInputStream(byte단위), FileReader(char단위) )
         * - 출력스트림 : 데이터를 출력하기 위한 스트림 ( FileOutputstream(byte단위), FileWriter(char단위) )
         * */

        try (FileWriter fout = new FileWriter("src/lecture/section02/stream/testFileWriter.txt")) {
//            char[] bar = new char[]{98, 99, 100, 101, 102};
//            fout.write(bar);
            fout.write("안녕하세요");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
