package com.moqi.groovy

/**
 * @author moqi* On 8/25/19 15:28
 */
class Trait {

    static void main(String[] args) {
        def student = new Student()
        student.setStudentID(1)

        student.DisplayMarks()
        student.DisplayTotal()
        student.aaa()
    }

}

trait Marks {
    void DisplayMarks() {
        println("Marks1");
    }

    void aaa() {
        println("aaa")
    }
}

trait Total {
    void DisplayTotal() {
        println("Total");
    }

    void aaa() {
        println("bbb")
    }
}

class Student implements Marks, Total {
    int StudentID

    /**
     * 使用 Override 选择的方式来规避多继承钻石问题
     * 如果没有 Override 则选择后面的 Trait 逻辑
     */
    @Override
    void aaa() {
        Marks.super.aaa()
    }

}
