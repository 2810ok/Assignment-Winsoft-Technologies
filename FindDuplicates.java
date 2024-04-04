public class FindDuplicates {

  public static void findDuplicates(String str) {
    char[] charArray = str.toCharArray();
    boolean[] visited = new boolean[256]; 

    System.out.print("Duplicate characters: ");
    for (int i = 0; i < charArray.length; i++) {
      int charIndex = charArray[i];
      if (visited[charIndex]) {
        System.out.print(charArray[i] + " ");
      } else {
        visited[charIndex] = true;
      }
    }
  }

  public static void main(String[] args) {
    String str = "omkar is best ";
    findDuplicates(str);
  }
}
