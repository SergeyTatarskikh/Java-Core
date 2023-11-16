import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Choose dict 1 or 2. For exit press 0");
            int numberDict = in.nextInt();
            boolean change = true;
            while (change) {
                switch (numberDict) {
                    case 1 -> {
                        System.out.println("Enter a filename: ");
                        String filename = in.next();
                        File file = new File(filename);
                        try {
                            boolean created = file.createNewFile();
                            if (created) {
                                System.out.println("completed.");
                            } else {
                                System.out.println("already.");
                            }
                        } catch (IOException e) {
                            System.out.println("error: " + e.getMessage());
                        }
                        Dictionary dick = new Dictionary(filename);
                        while (change) {
                            System.out.println("Choose an action: ");
                            System.out.println("1) Print the dictionary to the console");
                            System.out.println("2) Delete an entry by key");
                            System.out.println("3) Find a record by key");
                            System.out.println("4) Add entry");
                            System.out.println("0) Exit");

                            int option1 = in.nextInt();
                            switch (option1) {
                                case 1 -> dick.printDictionary();
                                case 2 -> {
                                    System.out.println("Enter the key");
                                    String removeKey = in.next();
                                    dick.removeItem(removeKey);
                                }
                                case 3 -> {
                                    System.out.println("Who your nado?");
                                    String answer = in.next();
                                    dick.searchItem(answer);
                                }
                                case 4 -> {
                                    System.out.println("Enter the key");
                                    String key = in.next();
                                    System.out.println("Enter the value");
                                    String value = in.next();
                                    dick.addItem1(key, value);
                                }
                                case 0 -> {
                                    System.out.println("Completion");
                                    change = false;
                                }
                                default -> System.out.println("Choose correct number");
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("Enter a filename: ");
                        String filename1 = in.next();
                        File file1 = new File(filename1);
                        try {
                            boolean created = file1.createNewFile();
                            if (created) {
                                System.out.println("completed.");
                            } else {
                                System.out.println("already.");
                            }
                        } catch (IOException e) {
                            System.out.println("error: " + e.getMessage());
                        }
                        Dictionary dick1 = new Dictionary(filename1);
                        while (change) {
                            System.out.println("Choose an action: ");
                            System.out.println("1) Print the dictionary to the console");
                            System.out.println("2) Delete an entry by key");
                            System.out.println("3) Find a record by key");
                            System.out.println("4) Add entry");
                            System.out.println("0) Exit");

                            int option2 = in.nextInt();
                            switch (option2) {
                                case 1 -> dick1.printDictionary();
                                case 2 -> {
                                    System.out.println("Enter the key");
                                    String removeKey = in.next();
                                    dick1.removeItem(removeKey);
                                }
                                case 3 -> {
                                    System.out.println("Who your nado?");
                                    String answer = in.next();
                                    dick1.searchItem(answer);
                                }
                                case 4 -> {
                                    System.out.println("Enter the key");
                                    String key = in.next();
                                    System.out.println("Enter the value");
                                    String value = in.next();
                                    dick1.addItem2(key, value);
                                }
                                case 0 -> {
                                    System.out.println("Completion");
                                    change = false;
                                }
                                default -> System.out.println("Choose correct number");
                            }
                        }
                    }
                    case 0 -> {
                        return;

                    }
                    default -> {

                        System.out.println("Choose correct number");
                        change = false;
                    }
                }
            }
        }
    }
}






//        try {
//            File file = new File("newfile.txt");
//            if(file.exists()){
//                file.createNewFile();
//            }
//            PrintWriter pw = new PrintWriter(file);
//            pw.println("Everything is working");
//            pw.close();
////            String filepath = "newfile.txt";
//            br = new BufferedReader(new FileReader(filepath));
//            String line;
//            while ((line = br.readLine())!=null){
//                System.out.println(line);
//            }
//        } catch (IOException e){
//            System.out.println("Error: " + e);
//        } finally {
//            br.close();
//        }
//
//
//
//
//        Map<String, String> dictionary = new HashMap<String, String>();
//        dictionary.put("мужчина", "man");
//        dictionary.put("стол","table");
//        dictionary.put("мама", "mother");
//        dictionary.put("папа", "father");
//
////        Scanner in = new Scanner(System.in);
//        String question = in.next();
//        //Получаем запрошенное по ключу значение
//        String man = dictionary.get(question);
//        System.out.println(man);
//        //Получаем список всех ключей
//        Set<String> keys = dictionary.keySet();
//        System.out.println(keys);
//        //Получаем набор всех значений
//        Collection<String> values = dictionary.values();
//        System.out.println(values);
//
//        for(Map.Entry<String,String> item :dictionary.entrySet()){
//            System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue());
//        }


