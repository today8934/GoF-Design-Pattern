package com.example.gofdesignpattern.singleton;

public class Settings {
    private Settings() {}

    /*
    Static Inner Class
    멀티 스레드 환경에서도 안전하며, getInstance를 호출할 때 inner class를 호출하므로
    객체를 미리 만들어 놓지 않아도 된다.
    (가장 권장하는 싱글톤 패턴 구현 방법)
     */
    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
