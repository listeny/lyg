package cn.wolfcode;

import lombok.*;

@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString
public class Student {

    private Long id;
    private String name;
    private char sex;

    public static void main(String[] args) {
        System.out.println(new Student());
    }
}
