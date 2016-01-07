import java.util.*;
import java.io.*;
class QuestionHour
{
    Scanner sc=new Scanner(System.in);
    int l=0,t=0,h=0;
    int[] ques;
    int bal;
    int wrong;

    public static void main(String[] args) throws IOException {
      QuestionHour qh = new QuestionHour();
      qh.Logo();
      qh.Space();
      qh.Start();
      qh.Space();
      qh.Rules();
      qh.Space();
      do {qh.Ques_Sel();} while(qh.wrong == 0);
    }

    void Logo()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~ ___        ___  ___ _____ _____  ___        ~~~");
        System.out.println("~~~|   | |  | |    /      |     |   |   | |    |~~~");
        System.out.println("~~~|   | |  | |    \\__    |     |   |   | |\\   |~~~");
        System.out.println("~~~|   | |  | |--     \\   |     |   |   | | \\  |~~~");
        System.out.println("~~~|   | |  | |       |   |     |   |   | |  \\ |~~~");
        System.out.println("~~~|__\\\\ \\__/ |___ ___/   |   ----- |___| |   \\|~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~      ___        ___ ~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~|  | |   | |  | |   \\~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~|  | |   | |  | |___/~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~|--| |   | |  | |\\   ~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~|  | |   | |  | | \\  ~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~|  | |___| \\__/ |  \\ ~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Hello!\nWelcome to Question Hour.\n");
    }

    void Start()
    {
        System.out.print("Name : ");
        String name=sc.nextLine();
        System.out.println("Welcome, "+name+" to Question Hour!!!");
    }

    int Space()
    {
        System.out.println("\nPress 1 to continue.");
        int space=sc.nextInt();
        System.out.println("\n");
        return space;
    }

    void Rules()
    {
        System.out.println("The rules of this game are very easy.");
        System.out.println("They are as following:-");
        System.out.println("1. There are 2 levels in this game, 'The Easy-Visey' and 'The Superior'");
        System.out.println("2. In each level there are 5 questions.");
        System.out.println("   There is also a bonus question which you can answer if you clear the first level without using");
        System.out.println("   any lifeline.");
        System.out.println("3. There are also lifelines that will help you in your journey through the game.");
        System.out.println("4. You get Rs.1000 for every correct answer in the first level.");
        System.out.println("   You get Rs.5000 for every correct answer in the second level.");
        System.out.println("   You get Rs.2500 if you answer correctly the bonus question.");
        System.out.println("5. Maximum money you could win is Rs.32,500");
        System.out.println("6. If you win Rs.32,500 you could play the next level of Question Hour.");
        System.out.println("Good Luck!");
    }

    void Print(String[] a)
    {
        for(int i=0;i<a.length-2;i++)
        {
            System.out.println(a[i]);
        }
    }

    void Lifeline(String[] q)
    {
        int ans=Integer.parseInt(q[6]);
        System.out.println("Choose your lifeline :-");
        if(l==0)
        System.out.println("1. Less Choices");
        if(t==0)
        System.out.println("2. 2 Chances");
        if(h==0)
        System.out.println("3. Hint Play");
        System.out.println("Enter your choice :-");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
            l++;
            System.out.println("Your options are :-");
            int r=(int)Math.random();
            int r1=0;
            if(r==0)
            {
                while(true)
                {
                    r1=(int)(Math.random()*(1-4)+4);
                    if(r1!=ans)
                    {
                        System.out.println(q[r1]);
                        break;
                    }
                }
                System.out.println(q[ans]);
            }
            else
            {
                System.out.println(q[ans]);
                r1=0;
                while(true)
                {
                    r1=(int)(Math.random()*(1-4)+4);
                    if(r1!=ans)
                    {
                        System.out.println(q[r1]);
                        break;
                    }
                }
            }
            System.out.print("Answer : ");
            int a1=sc.nextInt();
            if(a1==ans)
            {
                System.out.println("Correct answer.");
                bal+=1;
            }
            else
            {
                System.out.println("Wrong answer.");
                wrong++;
            }
            break;

            case 2:
            t++;
            System.out.println("First Chance :-");
            Print(q);
            System.out.print("Answer : ");
            int c1=sc.nextInt();
            if(c1==ans)
            System.out.println("Correct answer.");
            else
            {
                System.out.println("Second Chance :-");
                System.out.println(q[0]);
                if(c1!=1)
                System.out.println(q[1]);
                if(c1!=2)
                System.out.println(q[2]);
                if(c1!=3)
                System.out.println(q[3]);
                if(c1!=4)
                System.out.println(q[4]);
                System.out.print("Answer : ");
                int a2=sc.nextInt();
                if(a2==ans)
                {
                    System.out.println("Correct answer.");
                    bal+=1;
                }
                else
                {
                    System.out.println("Wrong answer.");
                    wrong++;
                }
            }
            break;

            case 3:
            h++;
            System.out.println("Your hint is :-");
            System.out.println(q[5]);
            Print(q);
            System.out.print("Answer : ");
            int a3=sc.nextInt();
            if(a3==ans)
            {
                System.out.println("Correct answer.");
                bal+=1;
            }
            else
            {
                System.out.println("Wrong answer.");
                wrong++;
            }
            break;
        }
    }

    void Call_Ques(int a1)throws IOException
    {
        FileReader fr=new FileReader("Ques"+a1+".txt");
        Scanner s=new Scanner(fr);
        String q1=s.nextLine();
        String o1=s.nextLine();
        String o2=s.nextLine();
        String o3=s.nextLine();
        String o4=s.nextLine();
        String h=s.nextLine();
        String ans=s.next();
        String[] q={q1,o1,o2,o3,o4,h,ans};
        Print(q);
        System.out.println("5 Lifeline.");
        System.out.println("Answer : ");
        int a=sc.nextInt();
        if(a==Integer.parseInt(q[6]))
        {
            System.out.println("Correct answer.");
            bal+=1;
        }
        else if(a==5)
        Lifeline(q);
        else
        {
            System.out.println("Wrong answer.");
            wrong++;
        }
    }

    void Ques_Sel()throws IOException
    {
        wrong=0;
        bal=0;
        int space=1;
        ques=new int[5];
        int c=0;
        outer:while(c<5&&wrong==0)
        {
            Random rn=new Random();
            int i=i=rn.nextInt()%10;
            for(int j=0;j<5;j++)
            {
                if(ques[j]==i)
                continue outer;
            }
            if(i<=7&&i>0&&space==1)
            {
                Call_Ques(i);
                ques[c]=i;
                c++;
                space=Space();
            }
        }
        System.out.println("You win Rs."+(bal*1000));
    }

}
