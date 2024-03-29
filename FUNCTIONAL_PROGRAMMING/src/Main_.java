import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main_ {

    public static void main(String[] args) throws IOException {

        //-----------------------------------------------------//FUNCTIONS//-----------------------------------------------
        System.out.println("---------------------------------------------FUNCTION CHAINING----------------------------------------------------");
        //Function wich receive String and return integer
        Function<String, Integer> wordCounter = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.split(" ").length;
            }
        };

        //Function wich receive Integer and return String
        Function<Object, String> textNumber = new Function<Object, String>() {
            @Override
            public String apply(Object integer) {
                switch ((Integer) integer) {
                    case 1:
                        return "one";
                    case 2:
                        return "two";
                    case 3:
                        return "three";
                    default:
                        return "unknown";
                }
            }
        };

        Function<String, String> toUpperCase = new Function<String, String>() {
            @Override
            public String apply(String o) {
                return o.toUpperCase();
            }
        };

        // String s = textNumber.andThen(toUpperCase).apply("qqw qww");

        Integer res = wordCounter.apply("word first then ...");

        String res2 = textNumber.apply(1);

        System.out.println("function WORD COUNTER " + res);

        System.out.println("function TEXT TO  NUMBER " + res2);

        //System.out.println("function UPPERCASE "+s);


        //CHAINING FUNCTION

        //textNumber use the result of wordCounter to create its own result
        String chainingres1 = wordCounter.andThen(textNumber).apply("Lorem ipsum");
        System.out.println("chaining function 1 " + chainingres1);

        //wordDetector use the result of textNumber to create its own result
        Integer chainingres2 = wordCounter.compose(textNumber).apply(1);
        System.out.println("chaining function 2 " + chainingres2);

        //-----------------------------------------------------//PREDICATE CLASSES//-----------------------------------------------
        //Get input and ouput boolean
        Predicate<String> sizeChecker = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 50;
            }
        };

        Predicate<String> wordChecker = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("ipsum");
            }
        };

        boolean b = sizeChecker.negate().and(wordChecker).test("Lorem chaining function chainingres2 ction chainingres2ction chainingres2ction chainingres2");
        System.out.println("Predicate " + b);


        //-----------------------------------------------------//SUPPLIER/CONSUMER//-----------------------------------------------
        System.out.println("---------------------------------------------SUPPLIER/CONSUMER/----------------------------------------------------");

        //FUNCTIONAL INTERFACES TO WHICH WE CAN ASSIGN LAMBDAS EXPRESSION TO PROCESS DATA

        /**
         *@ Doesnt get input but create an output
         * */
        Supplier<Calendar> calendarSupplier = new Supplier<Calendar>() {
            @Override
            public Calendar get() {
                return Calendar.getInstance();
            }
        };

        /**
         *@ get input but doesnt create an output
         * */
        Consumer<Date> dateIncrement = new Consumer<Date>() {
            @Override
            public void accept(Date date) {
                Calendar c = Calendar.getInstance();
                c.setTime(date);
                c.add(Calendar.DAY_OF_YEAR, 1);
                System.out.println("Tomorrow " + c.getTime());
            }
        };

        Consumer<Date> dayPrinter = new Consumer<Date>() {
            @Override
            public void accept(Date date) {

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy EEEE");
                System.out.println("Today " + sdf.format(date));

            }
        };

        dateIncrement.andThen(dayPrinter).accept(new Date());


        //-----------------------------------------------------//LAMBDAS//-----------------------------------------------
        System.out.println("---------------------------------------------LAMBDAS----------------------------------------------------");

        /**
         *
         * @USED TO SHORTEN THE CODE AND TO SIMPLIFY THE USAGE OF FUNCTIONS, PREDICATE,CONSUMER,SUPPLIER INTERFACES
         * @ALL INTERFACES METHODS MAY BE CHANGED WITH "->"
         * @JVM WILL UNDERSTAND WHICH METHOD TO USE
         * @"->" detect the proper interface and invoke the proper method
         *
         * */

        //JVM understand that it should use a predicate

        Predicate<String> wordCheckerLambda = s -> s.contains("Download");

        boolean result = wordCheckerLambda.test("Successfully download");

        System.out.println("lambda 1 =>" + result);

        //Shorten function
        Function<String, Integer> wordCounterLambda = (String s) -> {
            return s.split(" ").length;
        };
        //OR
        Function<String, Integer> wordCounterLambda2 = s -> {
            return s.split(" ").length;
        };


        Integer rslt = wordCounterLambda2.apply("ERWWW WDDEE");

        System.out.println("lambda 2 =>" + rslt);


        //Shorten Supplier
        Supplier<Calendar> supplierLambda = () -> Calendar.getInstance();

        Calendar c = supplierLambda.get();

        System.out.println("lambda 3 =>" + c.getTime());

        //-----------------------------------------------------//(::) OPERATOR//-----------------------------------------------
        System.out.println("---------------------------------------------::----------------------------------------------------");
        //IS USED TO EXECUTE CLASS'S METHOD

        Supplier<MyDate> supplier = MyDate::new;

        MyDate myDate = supplier.get();


        Function<Date, String> dayName = myDate::getCurrentDayName;

        System.out.println("FUNCTION=> " + dayName.apply(new Date()));


        Supplier<String> supplierDayName = myDate::getCurrentDayName;

        System.out.println("SUPPLIER=> " + supplierDayName.get());

       // Predicate<Date> predicateIsWe = myDate::isWeekEndDay;

        //System.out.println("PREDICATE=> " + predicateIsWe.test(myDate.getTomorrowDate(new Date())));


        //-----------------------------------------------------//OPTIONAL CLASS AND CHAINING FUNCTION//-----------------------------------------------
        System.out.println("---------------------------------------------OPTIONAL CLASS AND CHAINING FUNCTION----------------------------------------------------");

        //By that function we are trying to return the second word of a string
        Function<String, String> getSecondWord = (String s) -> {
            return s.split(" ").length > 1 ? s.split(" ")[1] : null;
        };

        //By that function we are trying to count letters of a string
        Function<String, Integer> getCountLetter = s -> s.length();

        //Output of the first function become input of the second
        Integer count = getSecondWord.andThen(getCountLetter).apply("Elimane Fofana");

        System.out.println("COUNT " + count);

        /**
         *
         * (OPTIONAL) A container object which may or may not contain a non-null value. If a value is present,
         *  isPresent() will return true and get() will return the value.
         *
         **/

        //That optional class is a way to avoid nullpointer exception
        Optional<String> myOptional = Optional.ofNullable(getSecondWord.apply("Elimane out"));

        boolean present = myOptional.isPresent();

//        String optionalRes = myOptional.isPresent() ? "second word is : "+myOptional.get() : "No value";

        if (myOptional.isPresent()) {
            myOptional.ifPresent(System.out::println);
        } else {
            String opres = myOptional.orElse("No value");
            System.out.println("OPTIONAL " + opres);
        }
        //ifpresent method use a consumer as argument
        Optional.ofNullable(getSecondWord.apply("Eli Mane")).ifPresent(System.out::println);
        Optional.ofNullable(getSecondWord.apply("Eli Mane")).map(getCountLetter).ifPresent(System.out::println);

        //-----------------------------------------------------//STREAMS//-----------------------------------------------
        System.out.println("---------------------------------------------STREAMS----------------------------------------------------");
        /**
         *
         *  STREAM IS A STRUCTURE FOR PROCESSING A COLLECTION IN FUNCTIONAL STYLE,
         *  ORIGINAL COLLECTION IS NOT MODIFIED,
         *  STREAM MAY BE PROCESSED ONLY ONCE,
         *  AFTER GETTING AN OUTPUT YOU CAN'T USE IT AGAIN IT DOESN'T KEEP DATA PERMANANTLY
         *  IN CONTRAST TO COLLECTIONS
         *
         **/

        //Allows sort lines into a file
        String path = "/Users/Elimane/Documents/File/file.txt";
        File file = new File(path);
//        Stream.iterate(0, n->n+2)
//                .peek(num -> System.out.println("Peeked at:"+num))
//                .limit(5)
//                .forEach(System.out::println);

//        List<String> errors = Files.lines(Paths.get(path))
//                .filter(l -> l.startsWith("ERROR"))
//                .limit(10)
//                .collect(toList());

        List<String> errors = Files.lines(Paths.get(path))
                .filter(l -> l.startsWith("ERROR"))
                .limit(10)
                .collect(toList());


        Optional.ofNullable(errors).ifPresent(System.out::println);

        //System.out.println("LINES "+Tests.getErrorLines(path));

        System.out.println("---------------------------------------------CONVERT COLLECTION INTO STREAMS----------------------------------------------------");

        Set<Integer> list = new HashSet<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //Conversion into stream
        Stream<Integer> stream = list.stream();

        //To display number list in ascending order
        stream.sorted((first, second) -> second - first).forEach(System.out::println);

        //To display number list in descending order
        //stream.sorted((f,s) -> f - s).forEach(System.out::println);


        System.out.println("---------------------------------------------STREAM WITH RANGE INTO STREAMS----------------------------------------------------");

        //PROCESSING DATA ONE INDIVIDUALLY one by one

        //Here we used generic type : Stream<Integer>
        //Stream<Integer> integerStream = Stream.of(3,4,5);

        //Here IntStream wraps the type
        IntStream integerStream = IntStream.of(3, 4, 5);

        integerStream.filter(i -> i < 5).forEach(System.out::println);

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

        //PROCESSING DATA'S RANGE
        //we have to create 3 separate streams from scratch because we cannot
        //use separated operators for the same stream
        IntStream rangeStream = IntStream.rangeClosed(10, 22).skip(1);
        IntStream rangeStream1 = IntStream.rangeClosed(10, 22).skip(1);
        IntStream rangeStream2 = IntStream.rangeClosed(10, 22).skip(1);

        //rangeStream.forEach(System.out::println);

        OptionalInt optionalMax = rangeStream.max();
        OptionalInt optionalMin = rangeStream1.min();
        OptionalDouble optionalAverage = rangeStream2.average();

        Integer max = optionalMax.getAsInt();
        Integer min = optionalMin.getAsInt();
        Double avg = optionalAverage.getAsDouble();

        System.out.println(max + " " + min + " " + avg);


        System.out.println("---------------------------------------------STREAM FILTERS-------------------------------------------------------------------------------------------");

        List<Student> students = new ArrayList<>();

        students.add(new Student("Eric", 22, 10));
        students.add(new Student("Rita", 34, 15));
        students.add(new Student("Bachir", 50, 18));
        students.add(new Student("Mario", 44, 20));
        students.add(new Student("Yann", 16, 11));

        //--------------filters


        Stream<Student> studentStream = students.stream();

//        studentStream.filter(data -> data.getMark() > 10)
//                     .filter(data -> data.getAge() < 20)
//                     .forEach(t-> System.out.println("Name :"+t.getName()));

        System.out.println("---------------------------------------------------FIND FIRST----------------------------------------------------");


        /**
         *
         *  @findFirst() is used to find a specific @optional data and it returns item conform to filter predicate
         *
         **/

//        Optional<Student> studentOptional = studentStream.
//                filter(student -> student.getName().equalsIgnoreCase("rita"))
//                .findFirst();
//
//        if(studentOptional.isPresent())
//        {
//            Student student = studentOptional.get();
//
//            System.out.println(student.getName()+" is there");
//        }
//        else
//        {
//            System.out.println("Name not found!!!");
//        }

        System.out.println("---------------------------------------------------ALL MATCH----------------------------------------------------");


        /**
         *
         *  @allMatch() is used to return boolean is predicate is verified
         *
         **/

        boolean mybool = studentStream.allMatch(student -> student.getAge() >= 16);

        if (mybool) {
            System.out.println("There are 16+ persons");
        } else {
            System.out.println("ERROR");
        }


        System.out.println("---------------------------------------------------MAP----------------------------------------------------");

        /**
         *
         *  @map() is to transform data into something else
         *
         **/

        List<Student> stds = new ArrayList<>();

        stds.add(new Student("Marc", 14, 19));
        stds.add(new Student("Kevin", 16, 15));
        stds.add(new Student("john", 12, 14));
        stds.add(new Student("scott", 11, 18));
        stds.add(new Student("Harry", 20, 12));


        Stream<Student> std = stds.stream();

        std.map(ConvertName::makeCorrectName)
                .forEach(System.out::println);


        //-------------------------------------
        List<String> listDate = new ArrayList<>();

        listDate.add("12/12/2018");
        listDate.add("10/12/2018");
        listDate.add("01/12/2018");
        listDate.add("31/12/2018");



        Stream<String> date = listDate.stream();

        date.map(ConvertStringIntoDate::convertDate)
                .forEach(System.out::println);





        System.out.println("---------------------------------------------------COUNT DISTINCT ORDER----------------------------------------------------");

        IntStream intStream = IntStream.of(1,1,2,1,4,3,5,6,7,8,7,6,8,5,8,5,9,10,23,1,3,1,4,5,6);

        intStream.distinct().forEach(System.out::println);
        //System.out.println(intStream.distinct().count());
        //System.out.println(intStream.count());



        System.out.println("---------------------------------------------------COLLECTOR----------------------------------------------------");

        /**
         *
         *  @COLLECTOR is a reducer operation , it takes a sequence of input and combine them into a single summary
         *  * Result may be one single collection or any type of one object instance
         *
         **/


            List<Employee> employees = new ArrayList<>();

            employees.add(new Employee("ADMIN","John",3000));
            employees.add(new Employee("IT","John",7000));
            employees.add(new Employee("FINANCE","John",9000));
            employees.add(new Employee("REPORTERS","John",12000));
            employees.add(new Employee("USERS","John",24000));
        employees.add(new Employee("FINANCE","Max",9000));

            Stream<Employee> streamEmployee = employees.stream();

//            double cost = streamEmployee.collect(Collectors.summingDouble(t -> t.getSalary()));
//        System.out.println("Salaries "+cost);

//        List<String> departmentsList = streamEmployee
//                                        .map(t -> t.getDepartment())
//                                        .distinct()
//                                        .collect(Collectors.toList());
//        System.out.println("departments list =>"+departmentsList);


        //PUT ITEMS INTO A DESRIRED CONTAINER, CONTAINER IS SUPPLIED WITH A SUPPLIER
//        Set<String> departmentsSet = streamEmployee
//                .map(t -> t.getDepartment())
//                .distinct()
//                .collect(Collectors.toCollection(HashSet::new));
//
//        System.out.println("departments set =>"+departmentsSet);

        System.out.println("---------------------------------------------------GROUPBY----------------------------------------------------");

        /**
         *
         *  @GROUP_BY allows to group items according to CRITERIA
         *
         *
         **/


//        Map<String, List<Employee>> employeesMap = streamEmployee.collect(Collectors.groupingBy(Employee::getDepartment));


//        Map<String, Double> employeesSalaryMap = streamEmployee.collect(
//                                                                Collectors.groupingBy(Employee::getDepartment,
//                                                                Collectors.summingDouble(Employee::getSalary)
//                                                                        ));

//        System.out.println("Employees map --> "+employeesMap);

//        System.out.println("Employees salary map --> "+employeesSalaryMap);


        //Group average salary by departments

//        List<DepartmentSalary> employeesAverageSalaryMap = streamEmployee.collect(
//                Collectors.groupingBy(Employee::getDepartment,
//                Collectors.averagingDouble(Employee::getSalary))).entrySet().stream()
//                .map(av -> new DepartmentSalary(av.getKey(),av.getValue()))
//                .collect(toList());


      //  System.out.println("Average salary by departments ->"+employeesAverageSalaryMap);



        System.out.println("---------------------------------------------------PEEK()----------------------------------------------------");

        /**
         *
         *  @PEEK() IS USED TO PEEK SOME ITEMS WHILE PROCESSING THE STREAM
         *
         *
         **/
//
//        List<String> listOfDate = new ArrayList<>();
//
//        listOfDate.add("04/03/2017");
//        listOfDate.add("11/03/2017");
//        listOfDate.add("18/03/2017");
//        listOfDate.add("25/03/2017");
//
//        //We have to populate that 2 arrays inside only one stream process
//        List<Date> dates = new ArrayList<>();
//        List<Date> weekEndDates = new ArrayList<>();
//
//
//        Stream<String> dateStream = listOfDate.stream();
//
//        dateStream.map(ConvertStringIntoDate::convertDate)
//                    .peek(d1 -> dates.add(d1))
//                    .filter(MyDate::isWeekEndDay)
//                    .peek(d2 -> weekEndDates.add(d2))
//                    .forEach(date1 -> System.out.println(date1));
//
////        ordinaryDates.forEach(System.out::println);
////        weekEndDates.forEach(System.out::println);
//
//        System.out.println("all dates size "+dates.size());
//        System.out.println("weekEnd dates size "+weekEndDates.size());



        System.out.println("---------------------------------------------------FLATMAP()----------------------------------------------------");


        /**
         *
         *  @FLATMAP() => MAP + FLATTEN , IT INPUT ONE OR SEREVAL COLLECTION,OBJECT, OR STREAM AND OUTPUT A SINGLE STREAM
         *
         **/

            Customer c1 = new Customer("Eric");
            Customer c2 = new Customer("Ori");



            c1.addProduct(new Product("Iphone",4000));
            c1.addProduct(new Product("Galaxy",1000));
            c2.addProduct(new Product("MacBook",7000));
            c2.addProduct(new Product("HP",6000));

            //Get purchases
//            List<Product> list1 = new ArrayList<>();
//            List<Product> list2 = new ArrayList<>();
//
//            c1.getProducts().forEach(product -> list1.add(product));
//            c2.getProducts().forEach(product -> list2.add(product));

        List<Customer> customerList = new ArrayList<>();
        customerList.add(c1);
        customerList.add(c2);

            //Transform multiple lists into a single stream
//            List<Product> singleStream = Stream.of(c1.getProducts(),c2.getProducts())
//                                                .flatMap(single -> single.stream())
        //Convert to profit by multiplying by 0.8
       double profit =  customerList.stream()
                    .map(customer -> customer.getProducts())
                    .flatMap(singleStream -> singleStream.stream())
                    .map(stream_ -> stream_.getPrice() * 0.8)
               //reduce operator for accumulate double values with (sum)
                    .reduce(0.0,Double::sum);
                    //.forEach(System.out::println);

        System.out.println("Total profit => "+profit);

    }


    }


