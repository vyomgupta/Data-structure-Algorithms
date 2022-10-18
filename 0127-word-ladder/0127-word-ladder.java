class Solution {
    
    public boolean isValid(String cword, String word){
        if(cword.length()!=word.length()){
            return false;
        }
        boolean allowed=false;
        for(int i=0;i<cword.length();i++){
            if(allowed == false && word.charAt(i)!=cword.charAt(i)){
                allowed =true;
            }
            else if(allowed == true && word.charAt(i)!=cword.charAt(i) ){
                return false;
            }
            
        }
        return true;
    }
    
    public class pair{
        String word;
        int idx;
        pair(String word, int idx){
            this.word = word;
            this.idx = idx;
        }
    }
    
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Queue<pair> q = new ArrayDeque<>();
        boolean visited[] = new boolean[wordList.size()];
        int count = 0;
        q.add(new pair(beginWord,-1));
        
        while(q.size()!=0){
            int size = q.size();
            count++;
            for(int j=0;j<size;j++){
                pair top = q.remove();
                String cWord = top.word;
                System.out.println(cWord);
                if(cWord.equals(endWord)){
                    return count;
                }
                int idx = top.idx;
        //        System.out.println(idx);
                for(int i=0;i<wordList.size();i++){
                    String word = wordList.get(i);
                    
                    if(visited[i] == false && isValid(cWord,word)){
                        visited[i] = true;
                        q.add(new pair(word,i));
                    }
                }
            }
            
        }
        return 0;
    }
}