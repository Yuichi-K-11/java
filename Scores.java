public class Scores{
   public static void main(String[] args){
      String[] names = new String[]{"青木","飯田","上田","江藤"};
      int[] scores = new int[]{80,65,70,95};

      for(int i=0; i< names.length; i++){
           System.out.println(names[i] + "さんの点数：" + scores[i] + "点");
      }
   }
}
