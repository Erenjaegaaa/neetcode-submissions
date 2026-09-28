class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }


        HashMap<Character,Integer>map=new HashMap<>();
        HashMap<Character,Integer>map1=new HashMap<>();
        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }

        for(int i=0;i<t.length();i++){

            char ch=t.charAt(i);
            
            if(map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)+1);
            }
            else{
                map1.put(ch,1);
            }
            
        }

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);

            if(!map.containsKey(ch)){
                return false;
            }
            if(!map.get(ch).equals(map1.get(ch))){
                return false;
            }
        }

        return true;

        


    }
}
