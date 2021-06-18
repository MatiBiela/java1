import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //    Random random = new Random();
        //    int randomInt = random.nextInt (100) + 1;
        //    System.out.println ("Twoja losowa liczba to " + randomInt);

        //      String string = "657-225-98-09";
        //      String[] parts = string.split("-");
        //      String cz1 = parts[0];
        //      String cz2 = parts[1];
        //      String cz3 = parts[2];

        //      System.out.println(cz1+cz2+cz3);

        //    StringBuilder sb = new StringBuilder();
        //    sb.append("W");
        //    sb.append(" ciemnym");
        //    sb.append(" pomieszczeniu");
        //    sb.append(" stała");
        //    sb.append(" czaszka");
        //    sb.append(" człowieka");

        //    String book = sb.toString();
        //    System.out.println(book);
        //    Scanner scanner = new Scanner(System.in);
        //    System.out.println("Wpisz tekst: ");
        //    String dlugosc = scanner.nextLine();
        //   System.out.println("Długośc tekstu to " + dlugosc.length() + " znaków");
        //    System.out.println("Przedostatnia litera tekstu to " + dlugosc.charAt(dlugosc.length() - 2));

        //    System.out.println("Podaj wyraz: ");
        //    Scanner sc = new Scanner(System.in);
        ///    String word = sc.nextLine();
        //    System.out.println(word.contains("kot"));

        //   String pd = "PieSek";
        //    System.out.println(pd.toLowerCase());
        //   System.out.println(pd.toUpperCase());

        //   boolean result;
        //    if(1 > 2) {
        //        result = true;
        //    } else {
        ///        result = false;
        //    }
        //    System.out.println(result);

        //    result = 1 > 2 ? true: false;
        //    System.out.println(result);

        //    boolean wieksza;
        //   Scanner scanner = new Scanner(System.in);
        //   System.out.println("Podaj liczbe: ");
        //    int liczba = scanner.nextInt();
        //    if(liczba > 5) {
        //        wieksza = true;
        //   } else {
        //        wieksza = false;
        //    }
        //     System.out.println(wieksza);

     /*   boolean web;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj link do witryny: ");
        String adres = scanner.nextLine();
        if (adres.startsWith("http") && adres.startsWith("https") && adres.startsWith("www")) {
            web = true;
        } else {
            web = false;
        }
        System.out.println(web);

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        if(string.startsWith("HTTP") || string.startsWith("HTTPS") || string.startsWith("www"))
        {
            System.out.println("Wpisana fraza jest linkiem");
        }
        else
        {
            System.out.println("Wpisana fraza nie jest linkiem");
        }


    }
}

        PrintWriter zapis = new PrintWriter("baza1.txt  ");
        zapis.println("Tutaj zawartość pliku");
        zapis.close();

            File plik = new File("baza1.txt");
            Scanner in = new Scanner(plik);

            String zdanie = in.nextLine();
            System.out.println(zdanie);

            Scanner odczyt = new Scanner();
            String pass;
            do {
                System.out.println("Podaj hasło (min. 5 znaków)");
                pass = odczyt.nextLine();
            } while(pass.isEmpty() || pass.length() < 5);
        System.out.println("Podane hasło spełnia wymagania");

            for (int i = 0; i<5; i++) {
                if(i % 2  == 0) {
                    continue;
                }
                System.out.println(i);
            }
            int j = 0;
            while(true) {
                if (j == 3) {
                    break;
                } else {
                    System.out.println(j);
                    j++;
                }
            }

            for(int i = 15; i<26; i++) {
                System.out.println(i);
            }

        Random random = new Random();
        int secretNumber = random.nextInt(20);
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        do {
            System.out.println("Podaj liczbę:");
            userNumber = scanner.nextInt();
            if(secretNumber>userNumber)
            {
                System.out.println("więcej");
            }
            if(secretNumber<userNumber)
            {
                System.out.println("mniej");
            }
            if(secretNumber==userNumber)
            {
                System.out.println("TAK TO TA");
            }

        }while(secretNumber!=userNumber);


        KontoBankowe oszczedniosciowe = new KontoBankowe();
        oszczedniosciowe.wplac(5000);
        if (oszczedniosciowe.wyplac(1000)){
            System.out.println("wypłacono");
        }else System.out.println("za mało środków");
        System.out.println(oszczedniosciowe.getSaldo());

        String uczen_nr_1 = "Wojtek";
        List<String> uczniowie = new ArrayList<String>();
        System.out.println(uczniowie.isEmpty());
        uczniowie.add("Kuba");
        uczniowie.add(uczen_nr_1);
        System.out.println(uczniowie.size());
        System.out.println(uczniowie.get(1));
        System.out.println(uczniowie);
        System.out.println(uczniowie.remove(0));
        System.out.println(uczniowie.get(0));

        Set<Integer> numery = new TreeSet<Integer>();
        numery.add(3);
        numery.add(5);
        numery.add(32);
        numery.add(31);
        numery.add(3);
        System.out.println(numery);


        List<Integer> numery = new Stack<>();
        numery.add(4);
        numery.add(24);
        numery.add(14);
        numery.add(64);
        numery.add(43);
        numery.remove(0);
        System.out.println(numery);

        Map<Integer,String> mapa1 = new HashMap<Integer, String>();
        Map<Integer,Integer> mapa2 = new HashMap<Integer, Integer>();
        Map<Character,Boolean> mapa3 = new HashMap<Character, Boolean>();
        Map<String,String> mapa4 = new HashMap<String, String>();

        mapa1.put(1,"pizza");
        mapa1.put(2,"burger");
        mapa1.containsValue("pizza");

        for(Integer key: mapa1.keySet()){
            mapa1.get(key);
        }
        for(Map.Entry<Integer, String>element:mapa1.entrySet()){
            element.getKey();
            element.getValue();
        }

        mapa4.put("kot","cat");
        mapa4.put("pies","dog");
        mapa4.containsKey("kot");
        System.out.println(mapa1);




        if (mapa4.containsKey("2kot")){
            System.out.println(mapa4.get("2kot"));
        }else {
            System.out.println("Nie znalezniono słowa");
        }

        JFrame frame = new JFrame("Moje nowe okno");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button = new JButton("PRESS!");
        JButton button2 = new JButton("Button 2");
        frame.getContentPane().add(button);
        frame.getContentPane().add(button2);
        frame.getContentPane().setBackground(Color.red);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        */


        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ObrazFrame();
            }
        });

        JFrame frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        //menu
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("PLIK");
        JMenu m2 = new JMenu("HELP");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("OPEN");
        JMenuItem m22 = new JMenuItem("SAVE");
        m1.add(m11);
        m1.add(m22);

        // spinamy elementy
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Wprowadz tekst:");
        JTextField tf = new JTextField(5);
        JButton send = new JButton("WYSLIJ");
        JButton reset = new JButton("RESET");
        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        JTextArea ta = new JTextArea();

        //dodajemy do ramki

        frame.getContentPane().add(BorderLayout.SOUTH,panel);
        frame.getContentPane().add(BorderLayout.NORTH,mb);
        frame.getContentPane().add(BorderLayout.CENTER,ta);

        frame.setVisible(true);

    }
}




