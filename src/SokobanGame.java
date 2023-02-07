package src;

public class SokobanGame {
    public SokobanGame () {
        // player:😊
        // box:📦
        // 목적지:🟩
        // 벽:🟥
        // 배경:🟨
        // 길:⬜
        // 🟦🟪🟧🟫⬛
        System.out.println("🟨🟨🟥🟥🟥🟨🟨🟨");
        System.out.println("🟨🟨🟥🟩🟥🟨🟨🟨");
        System.out.println("🟨🟨🟥⬜🟥🟥🟥🟥");
        System.out.println("🟥🟥🟥📦⬜📦🟩🟥");
        System.out.println("🟥🟩⬜📦😊🟥🟥🟥");
        System.out.println("🟥🟥🟥🟥📦🟥🟨🟨");
        System.out.println("🟨🟨🟨🟥🟩🟥🟨🟨");
        System.out.println("🟨🟨🟨🟥🟥🟥🟨🟨");
    }
    public static void main(String[] args) {
        new SokobanGame();
    }
}