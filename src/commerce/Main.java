package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * 실시간 커머스 플랫폼 메인 진입 클래스입니다.
 * {@link CommerceSystem} 인스턴스를 생성하고 {@code start()} 메서드를 호출하여
 * 커머스 서비스의 로직을 시작합니다.
 * @author leejihyeon
 * @version 0.1.0 [2026-04-02]
 */
public class Main {

    public static void main(String[] args) {

        CommerceSystem commerceSystem = new CommerceSystem();
        commerceSystem.start();


    }
}
