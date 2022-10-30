package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      String current_node="q0";
      char yal;
      int count=0;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<nodes> NFA=new ArrayList<nodes>();
        NFA.add(new nodes("q0" , "q1", "a"));
        NFA.add(new nodes("q0" , "q1", "b"));
        NFA.add(new nodes("q0" , "q1", "c"));
        NFA.add(new nodes("q1" , "q0", "a"));
        NFA.add(new nodes("q1" , "q0", "b"));
        NFA.add(new nodes("q1" , "q0", "c"));
        for (int i = 0; i <input.length() ; i++) {
            yal=input.charAt(i);
            if(current_node == "q0"){
                if(yal =='a' || yal=='b' || yal=='c'){
                    System.out.println("start: "+current_node+"  end:  "+"q1" +"  yal:  "+yal);
                    current_node="q1";
                }
                else {
                    System.out.println("false");
                    count=1;
                    break;
                }

            }
            else{
                if(yal =='a' || yal=='b' || yal=='c'){
                    System.out.println("start: "+current_node+"  end:  "+"q0" +"  yal:  "+yal);
                    current_node="q0";
                }
                else {
                    System.out.println("false");
                    count=1;
                    break;
                }
            }
        }

        if(current_node=="q0" && count==0)
        System.out.println("true");
        if(current_node=="q1" && count==0)
            System.out.println("false");
    }
}
class nodes{
    public String start_node;
    public String end_node;
    public String yal;
    public nodes(String start_node , String end_node , String yal){
        this.start_node=start_node;
        this.end_node=end_node;
        this.yal=yal;
    }
}
