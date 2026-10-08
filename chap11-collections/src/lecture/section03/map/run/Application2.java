package lecture.section03.map.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        /*
        * Properties
        * - Key - Value 쌍으로 모두 문자열만 사용할 수 잇는 자료구조
        * - 설정 파일의 설정 값을 저장하는 요도로 사용한다.
        * */

        Properties prop = new Properties();

        prop.setProperty("language", "Korean");
        prop.setProperty("theme", "dark");
        prop.setProperty("fontsize", "16");

        System.out.println("prop = " + prop); // 전체 출력

        // 조회
        // .getProperty(key) : key 값으로 value 조회하기
        System.out.println("언어 : " + prop.getProperty("language"));

        // 수정
        prop.setProperty("theme", "Light");
        System.out.println("prop = " + prop);

        // 파일 입출력
        try (FileOutputStream ouput = new FileOutputStream("setting.properties")){
            // 파일을 저장
            prop.store(ouput, "application settings");
            System.out.println("settings.properties 파일 저장 완료!");
        } catch (IOException e) {

        }
    }
}
