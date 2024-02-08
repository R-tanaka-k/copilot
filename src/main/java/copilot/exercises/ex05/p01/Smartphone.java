package copilot.exercises.ex05.p01;

public class Smartphone extends Device{
//     Deviceクラスを継承します
// - SmartphoneクラスではpowerOnメソッドとuseDeviceメソッドをオーバーライドして特定の動作を追加し、LaptopクラスではuseDeviceメソッドをオーバーライドします
// - SmartphoneクラスのpowerOnメソッドは、"Smartphone is powered on."と表示します
// - SmartphoneクラスのuseDeviceメソッドは、"Smartphone is used."と表示します
    public void powerOn() {
        System.out.println("Smartphone is powered on.");
    }

    public void useDevice() {
        System.out.println("Smartphone is used.");
    }
}
