// LegalArrays.java
// Examples of legal array declarations

class LegalArrays {
  
   // declararing array of primitives
   int[] key;                  // square brackets before name (recommended)
   int otherKey [];            // square brackets after name (legal. not recommended)

   // declaring array of object references
   Thread[] threads;           // Recommended
   Thread moreThreads [];      // Legal but not recommended

   // declaring multidimensional arrays
   String[][][] occupantName;  // Recommended
   String[][] ownerName [];    // Legal but not recommended 
}

// javac compiles LegalArray.java without errors
