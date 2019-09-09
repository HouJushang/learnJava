package designPattern.princlple.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(96, "patten", 348d);


        JavaDiscountCourse javaCourse2 = (JavaDiscountCourse) new JavaDiscountCourse(96, "patten", 348d);

        System.out.println("ID:" + javaCourse2.getId() + "名称:" + javaCourse2.getName() + "价格:" + javaCourse2.getPrice() + "原价:" + javaCourse2.getOriginPrice());
    }
}
