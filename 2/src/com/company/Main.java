package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String current_node="q0";
        char yal;
        int count=0;
        int counter=0;
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        List<nodes> NFA=new ArrayList<nodes>();
        NFA.add(new nodes("q0" , "q0", 'c'));
        NFA.add(new nodes("q0" , "q1", 'a'));
        NFA.add(new nodes("q0" , "q2", 'b'));
        NFA.add(new nodes("q1" , "q1", 'c'));
        NFA.add(new nodes("q1" , "q0", 'b'));
        NFA.add(new nodes("q1" , "q2", 'a'));
        NFA.add(new nodes("q2" , "q2", 'c'));
        NFA.add(new nodes("q2" , "q1", 'b'));
        NFA.add(new nodes("q2" , "q0", 'a'));
        for (int i = 0; i <input.length() ; i++) {
            yal=input.charAt(i);
            counter=0;
            if(yal =='a' || yal=='b' || yal=='c') {
                for (int j = 0; j < NFA.size(); j++) {

                    if (NFA.get(j).start_node == current_node && NFA.get(j).yal == yal && counter==0){
                        System.out.println("start:  "+current_node+"  end:  "+NFA.get(j).end_node+"  yal:  "+yal);
                        current_node=NFA.get(j).end_node;
                        counter=1;
                    }

                }
            }
            else {
                System.out.println("false");
                count=1;
                break;
            }

        }
        if(current_node=="q1" && count==0)
            System.out.println("true");
        if(current_node=="q0" && count==0)
            System.out.println("false");
        if(current_node=="q2" && count==0)
            System.out.println("false");
    }
}
class nodes{
    public String start_node;
    public String end_node;
    public char yal;
    public nodes(String start_node , String end_node , char yal){
        this.start_node=start_node;
        this.end_node=end_node;
        this.yal=yal;
    }
}
