 
import java.io.*;
class Question_Hour
{
public int v;
int bal;
int l;
int s;
int h;
String n;
int c;
int r;
int q1,q2,q3,q4,q5;
public Question_Hour()
{
}
public void drawing()
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





public int random1()throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number between 1-10");
String r1=br.readLine();
r=Integer.parseInt(r1);
r=(int)((Math.random()*(1-10))+10);
return r;
}





public int random2()throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("Enter a number between 1-10");
String r1=br.readLine();
r=Integer.parseInt(r1);
r=(int)((Math.random()*(1-10))+10);
return r;
}while(r==q1);
}




public int random3()throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("Enter a number between 1-10");
String r1=br.readLine();
r=Integer.parseInt(r1);
r=(int)((Math.random()*(1-10))+10);
return r;
}while(r==q1||r==q2);
}





public int random4()throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("Enter a number between 1-10");
String r1=br.readLine();
r=Integer.parseInt(r1);
r=(int)((Math.random()*(1-10))+10);
return r;
}while(r==q1||r==q2||r==q3);
}





public int random5()throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("Enter a number between 1-10");
String r1=br.readLine();
r=Integer.parseInt(r1);
r=(int)((Math.random()*(1-10))+10);
return r;
}while(r==q1||r==q2||r==q3||r==q4);
}






public void play()throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your name:");
n=br.readLine();
System.out.println("Welcome "+n+"\nYou Start with Rs."+bal);
System.out.println("\n\n");
}





public void Switch()throws IOException
{
Question_Hour obj=new Question_Hour();
switch(r)
{
case 1:
case 5:
case 8:
obj.Ques1();
break;
case 2:
case 3:
case 4:
obj.Ques2();
break;
default:
obj.Ques2();
break;
}
}





public void rules()
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





public void call()throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println();
System.out.println("Press enter to continue.");
String n=br.readLine();
}





public void Ques1()throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("\n\nSo are you ready.\nYour question is:");
System.out.println("\nWho is the first President of United States 0f America:\n");
System.out.println("1. George Bush");
System.out.println("2. George Washiongton");
System.out.println("3. Theodore Roosevelt");
System.out.println("4. Barack Obama");
System.out.println("5. To use a lifeline");
String option_1a=br.readLine();
int option_1=Integer.parseInt(option_1a);
System.out.println();
switch(option_1)
{
case 1:
case 3:
case 4:
System.out.println("\nSorry wrong answer.\nYou leave with Rs."+bal);
v+=1;
break;
case 2:
System.out.println("\nCorrect answer.You get Rs.1000");
break;
case 5:
System.out.println("\nWhich lifeline do you want use:");
System.out.println("1. Less Options");
System.out.println("2. Second Chance");
System.out.println("3. Hint");
String lifeline_1a=br.readLine();
int lifeline_1=Integer.parseInt(lifeline_1a);
System.out.println();
switch(lifeline_1)
{
case 1:
l=1;
System.out.println("Your two options are:");
System.out.println("1. George Bush");
System.out.println("2. George Washington");
String ll_11_op_1a=br.readLine();
int ll_11_op_1=Integer.parseInt(ll_11_op_1a);
System.out.println();
switch(ll_11_op_1)
{
case 1:
System.out.println("\nSorry wrong answer.\nYou leave with Rs."+bal);
v=1;
break;
case 2:
System.out.println("\nCorrect answer.\nYouget Rs.1000");
break;
}
break;
case 2:
s=1;
System.out.println("\nChoose your first answer.");
System.out.println("1. George Bush");
System.out.println("2. George Washiongton");
System.out.println("3. Theodore Roosevelt");
System.out.println("4. Barack Obama");
String ll_12_op_1a=br.readLine();
int ll_12_op_1=Integer.parseInt(ll_12_op_1a);
System.out.println();
switch(ll_12_op_1)
{
case 1:
case 3:
case 4:
System.out.println("\nSorry wrong answer.Try again.");
System.out.println("\nChoose your second answer.");
System.out.println("1. George Bush");
System.out.println("2. George Washiongton");
System.out.println("3. Theodore Roosevelt");
System.out.println("4. Barack Obama");
String ll_12_op_2a=br.readLine();
int ll_12_op_2=Integer.parseInt(ll_12_op_2a);
System.out.println();
switch(ll_12_op_2)
{
case 1:
case 3:
case 4:
System.out.println("\nSorry wrong answer.\nYou leave with Rs."+bal);
v=1;
break;
case 2:
System.out.println("\nCorrect answer.You get Rs.1000");
break;
}
break;
case 2:
System.out.println("\nCorrect answer.You get Rs.1000");
break;
}
break;
case 3:
h=1;
System.out.println("Hint:-\nOne of the major city of US is named after him\n");
System.out.println("So your options are:");
System.out.println("1. George Bush");
System.out.println("2. George Washiongton");
System.out.println("3. Theodore Roosevelt");
System.out.println("4. Barack Obama");
String ll_13_op_1a=br.readLine();
int ll_13_op_1=Integer.parseInt(ll_13_op_1a);
System.out.println();
switch(ll_13_op_1)
{
case 1:
case 3:
case 4:
System.out.println("\nSorry wrong answer.\nYou leave with Rs."+bal);
v=1;
break;
case 2:
System.out.println("\nCorrect answer.You get Rs.1000");
break;
}
break;
}
break;
}
}





public void Ques2()throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("\n\n\n\n");
System.out.println("\n\nSo are you ready.\nYour question is:");
System.out.println("\nIn which year did the Titanic sink:\n");
System.out.println("1. 1997");
System.out.println("2. 1921");
System.out.println("3. 1912");
System.out.println("4. 1954");
if(s==0||h==0||l==0)
System.out.println("5. To use a lifeline");
String option_2a=br.readLine();
int option_2=Integer.parseInt(option_2a);
System.out.println();
switch(option_2)
{
case 1:
case 2:
case 4:
System.out.println("\nSorry wrong answer.\nYou leave with Rs."+bal);
v=1;
break;
case 3:
System.out.println("\nCorrect answer.You get Rs.1000");
break;
case 5:
System.out.println("\nWhich lifeline do you want use:");
switch(l)
{
case 0:
System.out.println("1. Less Options");
break;
}
switch(s)
{
case 0:
System.out.println("2. Second Chance");
break;
}
switch(h)
{
case 0:
System.out.println("3. Hint");
break;
}
String lifeline_2a=br.readLine();
int lifeline_2=Integer.parseInt(lifeline_2a);
System.out.println();
switch(lifeline_2)
{
case 1:
l=1;
System.out.println("Your two options are:");
System.out.println("1. 1921");
System.out.println("2. 1912");
String ll_21_op_1a=br.readLine();
int ll_21_op_1=Integer.parseInt(ll_21_op_1a);
System.out.println();
switch(ll_21_op_1)
{
case 1:
System.out.println("\nSorry wrong answer.\nYou leave with Rs."+bal);
v=1;
break;
case 2:
System.out.println("\nCorrect answer.\nYouget Rs.1000");
break;
}
break;
case 2:
s=1;
System.out.println("\nChoose your first answer.");
System.out.println("1. 1997");
System.out.println("2. 1921");
System.out.println("3. 1912");
System.out.println("4. 1954");
String ll_22_op_1a=br.readLine();
int ll_22_op_1=Integer.parseInt(ll_22_op_1a);
System.out.println();
switch(ll_22_op_1)
{
case 1:
case 2:
case 4:
System.out.println("\nSorry wrong answer.Try again.");
System.out.println("\nChoose your second answer.");
System.out.println("1. 1997");
System.out.println("2. 1921");
System.out.println("3. 1912");
System.out.println("4. 1954");
String ll_22_op_2a=br.readLine();
int ll_22_op_2=Integer.parseInt(ll_22_op_2a);
System.out.println();
switch(ll_22_op_2)
{
case 1:
case 2:
case 4:
System.out.println("\nSorry wrong answer.\nYou leave with Rs."+bal);
v=1;
break;
case 3:
System.out.println("\nCorrect answer.You get Rs.1000");
break;
}
break;
case 3:
System.out.println("\nCorrect answer.You get Rs.1000");
break;
}
break;
case 3:
h=1;
System.out.println("Hint:-\nThe sum of digits of the year is 13.\n");
System.out.println("So your options are:");
System.out.println("1. 1997");
System.out.println("2. 1921");
System.out.println("3. 1912");
System.out.println("4. 1954");
String ll_23_op_1a=br.readLine();
int ll_23_op_1=Integer.parseInt(ll_23_op_1a);
System.out.println();
switch(ll_23_op_1)
{
case 1:
case 2:
case 4:
System.out.println("\nSorry wrong answer.\nYou leave with Rs."+bal);
v=1;
break;
case 3:
System.out.println("\nCorrect answer.You get Rs.1000");
break;
}
break;
}
break;
}
}
}