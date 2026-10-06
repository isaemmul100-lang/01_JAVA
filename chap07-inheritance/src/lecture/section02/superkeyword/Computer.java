package lecture.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {

    private String cpu;             // CPU 종류
    private int hdd;                // HDD 용량
    private int ram;                // Ram 용량
    private String operationsystem; // 운영체제

    // 기본생성자
    public Computer() {
//        super(); 생략가능
        System.out.println("Computer 클래스의 기본 생성자 호출함...");
    }

    // Computer 필드만 초기화하는 생성자
    public Computer(String cpu, int hdd, int ram, String operationsystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationsystem = operationsystem;

        System.out.println("Computer 클래스의 모든 필드를 초기화 하는생성자 호출함...");
    }

    // 부모의 필드도 모두 초기화 하는 생성자
    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationsystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationsystem = operationsystem;

        System.out.println("Computer 클래스의 부모 필드도 초기화하는 생성자 호출함.");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationsystem() {
        return operationsystem;
    }

    public void setOperationsystem(String operationsystem) {
        this.operationsystem = operationsystem;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operationsystem='" + operationsystem + '\'' +
                '}';
    }
}
