package com.back;

import com.back.system.SystemController;
import com.back.domaim.wiseSaying.controller.WiseSayingController;

import java.util.Scanner;

public class App {
    private Scanner sc;
    private WiseSayingController wiseSayingController;
    private SystemController systemController;

    public App(Scanner sc) {
        this.sc = AppContext.sc;
        wiseSayingController= AppContext.wiseSayingController;
        systemController = AppContext.systemController;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String cmd = sc.nextLine();

            switch (cmd) {
                case "등록" -> wiseSayingController.actionAdd();
                case "목록" -> wiseSayingController.actionList();
                case "종료" -> {
                    systemController.actionExit();
                    return;
                }
            }
        }

    }
}
