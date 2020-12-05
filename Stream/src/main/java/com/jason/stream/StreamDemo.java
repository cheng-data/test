package com.jason.stream;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
//        gen1();
//        gen2();
//        gen3();
//        gen4();
        gen5();
//        中间操作：如果调用方法之后返回的结果是stream对象看就意味着是一个中间操作
//        List<Integer> collect = Arrays.asList(1, 2, 3, 4, 5).stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
//        Arrays.asList(1, 2, 3, 4, 5).stream().filter(e -> e % 2 == 0).forEach(System.out::println);
//        System.out.println(collect);
////        结果集中的偶数求和
//        long count = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter(e -> e % 2 == 0).count();
//        int sum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter(e -> e % 2 == 0).mapToInt(x -> x).sum();
//        System.out.println(count);
//        System.out.println(sum);

//        求最值
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Optional<Integer> max = list.stream().max((a, b) -> a - b);
//        Optional<Integer> min = list.stream().min((a, b) -> a - b);
//        System.out.println(max.get());
//        System.out.println(min.get());


//        Optional<Integer> any = list.stream().filter(x -> x % 2 == 0).findAny();
//        System.out.println(any.get());
//
//        Optional<Integer> first = list.stream().filter(x -> x % 2 == 0).findFirst();
//        System.out.println(first.get());

//        Stream<Integer> integerStream = list.stream().filter(i -> i % 2 == 0);
//        System.out.println(integerStream);
//
//
//        Stream<Integer> integerStream2 = list.stream().filter(i ->
//                {
//                    System.out.println("运行开始");
//                    return i % 2 == 0;
//                });
//        System.out.println(integerStream2);
//        System.out.println(integerStream2.findFirst().get());


//        不使用min/max获取最值
//        Optional<Integer> min = list.stream().sorted().findFirst();
//        System.out.println(min.get());
//        Optional<Integer> max = list.stream().sorted((a, b) -> b - a).findFirst();
//        System.out.println(max.get());
//
//
//        Arrays.asList("java","c","python","scala").stream().sorted((a,b)->a.length() - b.length()).forEach(System.out::println);


//        将集合中的元素进行过滤同时返回一个对象
//        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        collect.forEach(System.out::println);


//        Arrays.asList(1,2,2,3,4,54,3,4,5,7).stream().distinct().forEach(System.out::println);
//        System.out.println("==============");
//        Arrays.asList(1,2,2,3,4,54,3,4,5,7).stream().collect(Collectors.toSet()).forEach(System.out::println);

//        打印20-30这样的数据
//        Stream.iterate(1,x->x+1).limit(50).skip(20).limit(10).forEach(System.out::println);

//        String str = "11,22,33,44,55";
//        System.out.println(Stream.of(str.split(",")).mapToInt(x -> Integer.valueOf(x)).sum());
//        System.out.println(Stream.of(str.split(",")).map(x -> Integer.valueOf(x)).mapToInt(x -> x).sum());
//        System.out.println(Stream.of(str.split(",")).map(x -> Integer.valueOf(x)).mapToInt(x -> x).sum());
//        System.out.println(Stream.of(str.split(",")).map(Integer::valueOf).mapToInt(x -> x).sum());


//        创建一组自定义对象
//        String str = "java,scala,python";
//        Stream.of(str.split(",")).map(x ->new Person(x)).forEach(System.out::println);
//        Stream.of(str.split(",")).map(Person::new).forEach(System.out::println);
//        Stream.of(str.split(",")).map(x->Person.build(x)).forEach(System.out::println);
//        Stream.of(str.split(",")).map( Person::build).forEach(System.out::println);

//        打印字符串中的每一个值，同时求和
        String str = "11,22,33,44,55";
//        System.out.println(Stream.of(str.split(",")).peek(System.out::println).mapToInt(Integer::valueOf).sum());
//        System.out.println(list.stream().allMatch(x -> x % 2 == 0));
//        System.out.println(list.stream().allMatch(x -> x >= 0));

//        list.stream().flatMap(x->String.valueOf())



    }

    //    通过数组生成
    public static void gen1() {
        String[] strs = {"a", "b", "c"};
        Stream<String> strs1 = Stream.of(strs);
        strs1.forEach(System.out::println);
    }

    //    通过集合生成
    public static void gen2() {
        List<String> list = Arrays.asList("1", "2", "3");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }

//    通过stream.generate生成
    static void gen3(){
        Stream<Integer> generate = Stream.generate(() -> 1);
        generate.limit(10).forEach(System.out::println);
    }

//    使用iterator
    static void gen4(){
        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1);
        iterate.limit(10).forEach(System.out::println);
    }

    //        其他方式
    public static void gen5(){
        String str = "abcdefg";
        IntStream stream = str.chars();
        stream.limit(10).forEach(System.out::println);
    }


}
