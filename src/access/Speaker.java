package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;

    }

    void volumeUp() {

        if (volume >= 100) {
            System.out.println("음량을 증가 할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("볼륨 10 증가");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("볼륨 다운");

    }

    void showVolume() {
        System.out.println("volume: " + volume);

    }
}
