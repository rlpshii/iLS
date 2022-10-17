package iLS;
import java.util.*;

public class iLS {
	public static void main(String[] args) {
        // questions and answers
        String [][][] questionAndAnswer = {
            //Science
            {
                {"The sun produces what kind of energy? \n (a) Heat \n (b) Solar \n (c) Electricity \n (d) Power", "a", "b", "c", "d", "a"}, 
                {"Airplane is moved by what energy? \n (a) Gas (Fuel) \n (b) Solar \n (c) Electricity \n (d) Oil", "a", "b", "c", "d", "a"}, 
                {"Solar panel produces what energy? \n (a) Light \n (b) Solar \n (c) Electricity \n (d) Hydro", "a", "b", "c", "d", "b"},  
                {"A grill produces what type of energy form? \n (a) Light \n (b) Solar \n (c) Heat \n (d) Electric", "a", "b", "c", "d", "c"}, 
                {"Do people make energy when they exercise, like running? \n (a) maybe \n (b) yes \n (c) no \n (d) 50/50", "a", "b", "c", "d", "b"},
                //Digestive Process
                {"How long is an adult's small intestine? \n (a) 33 in \n (b) 22ft \n (c) 30ft \n (d) 100 in", "a", "b", "c", "d", "b"},
                {"The digestive process starts in the ________? \n (a) Mouth \n (b) Stomach \n (c) Esophagus \n (d) Liver", "a", "b", "c", "d", "a"},
                {"What tube moves food from the back of your throat to the stomach? \n (a) Pharynx \n (b) Feeding Tube \n (c) Esophagus \n (d) Intestine", "a", "b", "c", "d", "c"},
                {"The large intestine measures about ________? \n (a) 3ft \n (b) 5ft \n (c) 4ft \n (d) 6ft", "a", "b", "c", "d", "b"},
                {"When mashed-up food particles reach the stomach, they mix up with _______? \n (a) Mucus \n (b) Bile \n (c) Gastric Juice (d) orange juice", "a", "b", "c", "d", "c"},
                //States Of Matter
                {"Which of the following are NOT states of matter? \n (a) Solid \n (b) Evaporation \n (c) Plasma \n (d) Bose-Einstein Condensate", "a", "b", "c", "d", "b"},
                {"Matter that has its own shape and takes up space. \n (a) Solid \n (b) Liquid \n (c) Gas \n (d) Plasma", "a", "b", "c", "d", "a"},
                {"Molecules are closest together. \n (a) Solid \n (b) Liquid \n (c) Gas \n (d) Plasma", "a", "b", "c", "d", "a"},
                {"What term describes a liquid changing to a solid? \n (a) Colding \n (b) Evaporation \n (c) Icing \n (d) Freezing", "a", "b", "c", "d", "d"},
                {"Milk takes the shape of its container because it is a: \n (a) Liquid \n (b) Solid \n (c) Gas \n (d) Water", "a", "b", "c", "d", "a"},
                //Solar System
                {"How long does it take to the Earth to do the ROTATION MOVEMENT? \n (a) 28 days \n (b) 365 days \n (c) 24 hours \n (d) 24 hours + 6 hours", "a", "b", "c", "d", "c"},
                {"What is the Moon? \n (a) Asteroid \n (b) Comet \n (c) Star \n (d) Satellite", "a", "b", "c", "d", "d"},
                {"What is the Sun? \n (a) Asteroid \n (b) Comet \n (c) Star \n (d) Satellite", "a", "b", "c", "d", "c"},
                {"Who is Neil Amstrong? \n (a) Discovered Philippines \n (b) First man in Japan \n (c) the man who invented the telescope \n (d) First man on the moon", "a", "b", "c", "d", "d"},
                {"What is the red planet? \n (a) Venus \n (b) Saturn \n (c) Mars \n (d) Vulcan", "a", "b", "c", "d", "c"},
                //Earth
                {"Which Earth system includes rocks, sand, and mountains? \n (a) Biosphere \n (b) Atmosphere \n (c) Geosphere \n (d) Hydrosphere", "a", "b", "c", "c", "c"},
                {"We live in the _______ layer, a level of the atmosphere. \n (a) Exosphere \n (b) Stratosphere \n (c) Mesosphere \n (d) Troposphere", "a", "b", "c", "d", "d"},
                {"What is the outermost layer of the Earth? \n (a) Outer core \n (b) Mantel \n (c) Crust \n (d) Asthenosphere", "a", "b", "c", "d", "c"},
                {"Which type of rock is formed from the solidification of magma or lava? \n (a) Igneous \n (b) Bioclastic \n (c) Sedimetary \n (d) Metamorphic", "a", "b", "c", "d", "a"},
                {"Water on Earth is either freshwater or saltwater. What is the percent ratio of freshwater to percent saltwater on Earth? \n (a) 1% freshwater : 99% saltwater \n (b) 3% freshwater : 97% saltwater \n (c) 30% freshwater : 70% saltwater \n (d) 50% freshwater : 50% saltwater", "a", "b", "c", "d", "b"},
            },
            //Math
            {
                {"_______ are lines that lie in the same plane \n (a) Coplanar Lines \n (b) Line Segment \n (c) Collinear Points \n (d) Intersection", "a", "b", "c", "d", "a"}, 
                {"Points on the same line are _______ points \n (a) Collinear \n (b) Conjecture \n (c) Coordinate \n (d) Coplanar", "a", "b", "c", "d", "a"}, 
                {"A straight figure having no thickness and extending infinitely in both directions \n (a) Ray \n (b) Line \n (c) Point \n (d) Straight Angle", "a", "b", "c", "d", "b"},  
                {"A line with a single endpoint (or point of origin) that extends infinitely in one direction \n (a) Point \n (b) Line \n (c) Ray \n (d) Straight Line", "a", "b", "c", "d", "c"}, 
                {"This geometric object has no dimension and is represented as a single dot in space \n (a) Line Segment \n (b) Point \n (c) Plane \n (d) Ray", "a", "b", "c", "d", "b"},
                //Integers
                {"-5 + (-6) \n (a) 11 \n (b) -11 \n (c) 1 \n (d) -1 in", "a", "b", "c", "d", "b"},
                {"-3 x -5 \n (a) 15 \n (b) -15 \n (c) 8 \n (d) -8", "a", "b", "c", "d", "a"},
                {"-18 / 2 \n (a) -16 \n (b) 16 \n (c) -9 \n (d) 9", "a", "b", "c", "d", "c"},
                {"-4 - (-3) \n (a) -7 \n (b) -1 \n (c) 1 \n (d) 7", "a", "b", "c", "d", "b"},
                {"-(-5) is the same as \n (a) 5^3 \n (b) -5 \n (c) 5 (d) 5^2", "a", "b", "c", "d", "c"},
                //Fraction
                {"2/7 + 3/7 \n (a) 1 \n (b) 5/7 \n (c) 4/7 \n (d) 6/14", "a", "b", "c", "d", "b"},
                {"in the fraction 6/9, 9 is called? \n (a) Denominator \n (b) Improper fraction \n (c) Mixed Number \n (d) Numerator", "a", "b", "c", "d", "a"},
                {"These are fractions with the same denominators. \n (a) Similar fraction \n (b) Mixed fraction \n (c) Dissimilar fraction \n (d) none in the above", "a", "b", "c", "d", "a"},
                {"It is composed of a whole number and a fraction \n (a) Similar fraction \n (b) Dissimilar Fraction \n (c) Factoring \n (d) Mixed fraction", "a", "b", "c", "d", "d"},
                {"1/3 x 2/3 \n (a) 2/9 \n (b) 4/7 \n (c) 1/3 \n (d) 2/6", "a", "b", "c", "d", "a"},
                //Functions
                {"f(x) = 2x + 1, find f(1). \n (a) f(1) = 9 \n (b) f(1) = 0 \n (c) f(1) = 3 \n (d) f(1) = 6", "a", "b", "c", "d", "c"},
                {"Every input has only one output \n (a) Function \n (b) One to One \n (c) Many to Many \n (d) One to Many", "a", "b", "c", "d", "a"},
                {"Which set of ordered pairs is a function? \n (a) (9,5), (10,5), (9,-5), (10,-5) \n (b) (3,4), (4,-3), (7,4), (3, 8) \n (c) (6,-5), (7, -3), (8, -1), (9, 1) \n (d) (2, -2), (5, 9), (5, -7), (1, 4)", "a", "b", "c", "d", "c"},
                {"What is the combination of 2 or more functions? \n (a) Logarithmic \n (b) Rational \n (c) Inverse \n (d) Composition", "a", "b", "c", "d", "d"},
                {"Can be written into f(x) = b^x \n (a) Rational \n (b) Logarithmic \n (c) Expoential \n (d) Composition", "a", "b", "c", "d", "c"},
                //Algebra
                {"4a x 2a \n (a) 6a \n (b) 8a \n (c) 8a^2 \n (d) 6a^2", "a", "b", "c", "c", "c"},
                {"3m + 5m \n (a) 15m \n (b) 8m^2 \n (c) 15m^2 \n (d) 8m", "a", "b", "c", "d", "d"},
                {"The number in front of a variable is called a _______ \n (a) Exponent \n (b) Base \n (c) Coefficient \n (d) Equation", "a", "b", "c", "d", "c"},
                {"3m + 6m? \n (a) 9m \n (b) 18m \n (c) 3m \n (d) 2m", "a", "b", "c", "d", "a"},
                {"log2 + lo6 \n (a) log8 \n (b) log12 \n (c) log3 \n (d) log4", "a", "b", "c", "d", "b"},
            },
            //Major ITM
            {
                {"It is A high level, modern progarmming language designed in the early 1990s \n (a) JAVA \n (b) Python \n (c) JavaScript \n (d) TypeScript", "a", "b", "c", "d", "a"}, 
                {"How do you write a single comment? \n (a) // \n (b) /* \n (c) /* */ \n (d) /** */", "a", "b", "c", "d", "a"}, 
                {"Which is NOT a math operator \n (a) + \n (b) = \n (c) / \n (d) %", "a", "b", "c", "d", "b"},  
                {"Used to declare whole integer \n (a) double \n (b) String \n (c) int \n (d) float", "a", "b", "c", "d", "c"}, 
                {"Only accepts TRUE or FALSE \n (a) char \n (b) boolean \n (c) int \n (d) double", "a", "b", "c", "d", "b"},
                {"Less than operator is denoted by? \n (a) <= \n (b) < \n (c) >= \n (d) > in", "a", "b", "c", "d", "b"},
                {"Not operator is denoted by? \n (a) ! \n (b) && \n (c) ; \n (d) ==", "a", "b", "c", "d", "a"},
                {"Increment is denoted by? \n (a) -- \n (b) // \n (c) ++ \n (d) **", "a", "b", "c", "d", "c"},
                {"Executes when the if statement is false \n (a) switch \n (b) else \n (c) case \n (d) for", "a", "b", "c", "d", "b"},
                {"Greater than or equal is denoted by? \n (a) == \n (b) > \n (c) >= \n (d) <", "a", "b", "c", "d", "c"},
                {"Which is NOT a data type? \n (a) boolean \n (b) if else \n (c) short \n (d)float", "a", "b", "c", "d", "b"},
                {"in the fraction 6/9, 9 is called? \n (a) Denominator \n (b) Improper fraction \n (c) Mixed Number \n (d) Numerator", "a", "b", "c", "d", "a"},
                {"How do you import Scanner? \n (a) import java.util.Scanner; \n (b) import Java.util.Scanner; \n (c) import java util.Scanner; \n (d) none in the above", "a", "b", "c", "d", "a"},
                {"Is is the remainder of the division \n (a) Subtraction \n (b) Addition \n (c) Division \n (d) Modulo", "a", "b", "c", "d", "d"},
                {"What is syntax? \n (a) Rules of a programming language \n (b) Reading every line of code \n (c) Processing data \n (d) All in the above", "a", "b", "c", "d", "a"},
                {"What is the snippet of public static void main(String[] args) \n (a) suot \n (b) psbm \n (c) psvm \n (d) sout", "a", "b", "c", "d", "c"},
                {"This can handle mutiple values \n (a) Arrays \n (b) Conditional loops \n (c) Data type \n (d) Multidimensional", "a", "b", "c", "d", "a"},
                {"Scanner myVar = new _______(System.in);? \n (a) System \n (b) String \n (c) Scanner \n (d) Array", "a", "b", "c", "d", "c"},
                {"System.out._______? \n (a) pasteln; \n (b) applyln; \n (c) declareln; \n (d) println;", "a", "b", "c", "d", "d"},
                {"String Var = _______? \n (a) Double quote \n (b) Single Quote \n (c) Underscore \n (d) None in the above", "a", "b", "c", "d", "a"},
                {"This terminates the loop \n (a) pause; \n (b) stop; \n (c) break; \n (d) stop;", "a", "b", "c", "c", "c"},
                {"How is the OR operator denoted \n (a) ?? \n (b) && \n (c) ! \n (d) ||", "a", "b", "c", "d", "d"},
                {"How is the not equal to operator denoted \n (a) == \n (b) n= \n (c) != \n (d) ?=", "a", "b", "c", "d", "c"},
                {"It is the different kinds of codes per characeter \n (a) Ascii Code \n (b) Asii Code \n (c) Acci Code \n (d) Asci Code", "a", "b", "c", "d", "a"},
                {"How is the prefix increment denoted \n (a) Var++ \n (b) ++Var \n (c) Var-- \n (d) --Var", "a", "b", "c", "d", "b"},
            },
            //History
            {
                {"Which of the following is known as the ' Father of History'?\n (a) Herodotus \n (b) Aristotle \n (c) Xenophon \n (d) Zeus", "a", "b", "c", "d", "a"}, 
                {"Which one of the following is NOT the characteristic of history?\n (a) Future \n (b) Conjecture \n (c) Interpretations \n (d) Time and space", "a", "b", "c", "d", "a"}, 
                {"The first people to study history seriously were _______.\n (a) An English \n (b) The ancient Greeks \n (c) A Scottish \n (d) The Persians", "a", "b", "c", "d", "b"},  
                {"A nation where the idea of fraternity , equality and liberty was born.\n (a) Japan \n (b) Korea \n (c) France \n (d) India", "a", "b", "c", "d", "c"}, 
                {"Whose the one who writes history \n (a) Writer \n (b) Historian \n (c) Reader \n (d) None", "a", "b", "c", "d", "b"},
                //Philippine History
                {"Who named the Philippines? \n (a) Magellan \n (b) Ruy Lopez de Villlalobos \n (c) King Philip II \n (d) Jose Rizal in", "a", "b", "c", "d", "b"},
                {"Who is the first president of the Philippines? \n (a) Emilio Aguinaldo \n (b) Apolinario Mabini \n (c) Andres Bonifacio \n (d) Ferdinand Marcos", "a", "b", "c", "d", "a"},
                {"Who killed Magellan? \n (a) Meliodas \n (b) Raja Solayman \n (c) Lapu-Lapu \n (d) None in the above", "a", "b", "c", "d", "c"},
                {"Who is the founder of KKK? \n (a) Emilio Aguinaldo \n (b) Andres Bonifacio \n (c) Antonio Luna \n (d) All in the above", "a", "b", "c", "d", "b"},
                {"Where did the name of the Philippines came from? \n (a) King Philip I of Spain \n (b) Queen Ellizabeth \n (c) King Philip II of Spain (d) None in the above", "a", "b", "c", "d", "c"},
                {"What is considered the earliest form of writing in the Philippines? \n (a) Cuneiform \n (b) Baybayin \n (c) Indus script \n (d) Alphabets", "a", "b", "c", "d", "b"},
                {"Who led the longest revolt in the Philippines during the Spanish times? \n (a) Francisco Dagohoy \n (b) Andres Bonifacio \n (c) Jose Rizal \n (d) Apolinario Mabini ", "a", "b", "c", "d", "a"},
                {"Who created the designs for the Philippine national flag? \n (a) Emilio Aguinaldo \n (b) Andres Bonifacio \n (c) Apolinario Mabini \n (d) Jose Rizal", "a", "b", "c", "d", "a"},
                {"Name of the oldest Philippine city \n (a) Bataan \n (b) Manila \n (c) Ilo-Ilo \n (d) Cebu", "a", "b", "c", "d", "d"},
                {"Who wrote El Filibusterismo \n (a) Jose Rizal \n (b) Emilio Aguinaldo \n (c) Andres Bonifacio \n (d) Apolinario Mabini", "a", "b", "c", "d", "a"},
                //World History
                {"Which river is known as 'the giver and taker of life'? \n (a) Mississippi River \n (b) Red River \n (c) Nile River \n (d) Ilog Pasig", "a", "b", "c", "d", "c"},
                {"Who built a canal to link the Nile River to the Red Sea? \n (a) Pharaohs \n (b) Hyksos \n (c) Babylonians  \n (d) Peasants ", "a", "b", "c", "d", "a"},
                {"Which of the following figures did not live in the 6th century B.C.? \n (a) Confucius \n (b) Buddha \n (c) Nero \n (d) Pythagoras", "a", "b", "c", "d", "c"},
                {"Before independence, Bangladesh was called? \n (a) Ceylon \n (b) Bangalore \n (c) Bhutan \n (d) East Pakistan", "a", "b", "c", "d", "d"},
                {"The invasion of the Goths in the 5th century led to the end of which empire? \n (a) The Ottoman \n (b) The Byzantine \n (c) The Roman \n (d) The Holy Roman", "a", "b", "c", "d", "c"},
                //World War II 
                {"World War II started when Germany invaded which country? \n (a) Belgium \n (b) Great Britain \n (c) Poland \n (d) France", "a", "b", "c", "c", "c"},
                {"Which technology helped the U.K. defeat Germany's monthslong air offensive against it in the Battle of Britain? \n (a) Stealth Plane \n (b) Atomic Bomb \n (c) Rockets \n (d) Radar", "a", "b", "c", "d", "d"},
                {"Japan launched an attack on the U.S. mainland by using which curious method?\n (a) Tanks \n (b) Trained Dolphins \n (c) Helium Balloons \n (d) Scuba Divers", "a", "b", "c", "d", "c"},
                {"Based on the year they were first produced, which name was given to one of Japan's most highly effective fighter planes? \n (a) Zeroes \n (b) Niners \n (c) Thirty-eights \n (d) Deuces", "a", "b", "c", "d", "a"},
                {"Referring to a desperate maneuver used to sink Allied ships, kamikaze literally means what? \n (a) Iceberg \n (b) Divine wind \n (c) Floating Mine \n (d) Hungry Sharks", "a", "b", "c", "d", "b"},
            }
        };
        int score = 0;
        int subjectChange = 0;
        Scanner scans = new Scanner(System.in);
        // looping
        boolean looping =  true;
        while(looping) {
            score = 0;
            subjectChange = 0;
            for (int i = 0; i<20; i++){
                 if (i == 0){
                    System.out.println("_____________________\nSCIENCE PART OF THE QUIZ");
                } else if (i == 5) {
                    ++subjectChange; 
                    System.out.println("_____________________\nMATHEMATICS PART OF THE QUIZ");
                } else if (i == 10) {
                    ++subjectChange;
                    System.out.println("_____________________\nMAJOR IT PART OF THE QUIZ");
                } else if (i == 15) {
                    ++subjectChange;
                    System.out.println("_____________________\nHISTORY PART OF THE QUIZ");
                } else if (i == 20) {
                    break;
                }

                Random rand = new Random();
                int randomizer = rand.nextInt(25);
                String question = questionAndAnswer[subjectChange][randomizer][0];
                String choice1 = questionAndAnswer[subjectChange][randomizer][1];
                String choice2 = questionAndAnswer[subjectChange][randomizer][2];
                String choice3 = questionAndAnswer[subjectChange][randomizer][3];
                String choice4 = questionAndAnswer[subjectChange][randomizer][4];
                String correctAnswer = questionAndAnswer[subjectChange][randomizer][5];
                System.out.println(">>>>>>>>>>>>>> QUESTION " + i +" <<<<<<<<<<<<<<<\n" + question + "\nplease input your answer:");
                String answer = scans.nextLine();
                if (answer.equalsIgnoreCase(correctAnswer)) {
                    score++;
                    System.out.println("_______________________________________\nthe answer is: " + correctAnswer);
                    System.out.println("CORRECT! \nYOUR SCORE: " + score + "/20");
                } else if (!answer.equalsIgnoreCase(correctAnswer)) {
                    if (answer.equalsIgnoreCase(choice1)) {
                        System.out.println("_______________________________________\nthe answer is: " + correctAnswer);
                        System.out.println("INCORRECT! \nYOUR SCORE: " + score + "/20");
                    } else if (answer.equalsIgnoreCase(choice2)) {
                        System.out.println("_______________________________________\nthe answer is: " + correctAnswer);
                        System.out.println("INCORRECT! \nYOUR SCORE: " + score + "/20");
                    } else if (answer.equalsIgnoreCase(choice3)) {
                        System.out.println("_______________________________________\nthe answer is: " + correctAnswer);
                        System.out.println("INCORRECT! \nYOUR SCORE: " + score + "/20");
                    } else if (answer.equalsIgnoreCase(choice4)) {
                        System.out.println("_______________________________________\nthe answer is: " + correctAnswer);
                        System.out.println("INCORRECT! \nYOUR SCORE: " + score + "/20");
                    } else {
                        --i;
                        System.out.println("INVALID!");
                    }
                } else {
                    System.out.println("ERROR");
                }
            }
            // grading system
            int equal = score;
            int over = 20;
            double percent = score * 100 / over;
            System.out.println("__________________________");
            if (score == 20) {
                System.out.println("PROUD OF YOU! \n" + score + "/20 (" + percent + "%) PERFECT SCORE");
                looping = false;
            } else if (score >= 11) {
                System.out.println("CONGRATS KEEP IT UP\n" + score + "/20 (" + percent + "%) GOOD GRADE");
                looping = false;
            } else if (score == 10) {
                System.out.println("PASSED CONGRATS \n" + score + "/20 (" + percent + "%) PASSING GRADE");
                looping = false;
            } else if (score >= 0) {
                System.out.println("FAILED OH NO! \n" + score + "/20 (" + percent + "%) FAILING GRADE");
                System.out.println("_________________________\nYOU WILL RE-TAKE THE TEST\n\n\n\n");
                continue;
            } else {
                System.out.println("ERROR!");
            }
        }
        scans.close();
    }
}
