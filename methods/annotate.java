// BIG IDEA - ArrayList work a lot like arrays
// PROVIDE this code as a starter for the discussion.
// PROVIDE example arrayList(s) for students  like {0,1,2,3,3,4,5}  //STUDENT PROMPT: Discuss why it returns location of first 3
  public int linearSearch(int value, ArrayList<Integer> data) {
     //declaration for the function integer called value - array list of integers called data

    int foundIndex = -1; //the integer  // FIRSTDRAFT REVISION remove

    for (int i=0; i < data.size(); i++) {
      //Student prompt: Can someone say in words what line 7 means?

      int element = data.get(i);

      if (element == value) { // STUDENT-PROMPT How can we revise this? DELIBERATE-ERROR make this e not element =P
        foundIndex = i;   // FIRSTDRAFT REVISION turn this into return i;
        break;            // FIRSTDRAFT REVISION remove when you do above
        }
      }
    return foundIndex;    // FIRSTDRAFT REVISION return -1;
  }

//purpose of function is to return index of the value and if there isn't one then return -1

//MUST-ANSWER-Q :: a question that must be resolved, that a majority of your class must understand before moving on - why do we need i++ on line 6

/* PROVIDE :: code snippets or comments you definitely want to provide
STUDENT-PROMPT :: a specifically-worded question you want to ask, or a general solicitation for input, etc



BIG IDEA :: an introduction of a new topic, a connection to prior lesson or discussion for application here in code, etc.

BEEG REVEAL :: this is gonna blow yer minds...

DELIBERATE-ERROR :: specific code snippet or a general approach that is a bad fit for the situation, is flat-out wrong, or will lead to a compile- or run-time error, etc.

FIRSTDRAFT :: code that will work for now, but which you intend to replace later

REVISION vX :: better versions of firstdraft code... */