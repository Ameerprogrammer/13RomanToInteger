class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        for(int i = 0; i < s.length(); i++) {

            //current roman character number from 'I' to 1
            int currentNumInMap = map.get(s.charAt(i));
                   //length out of bounds      //2nd position         //1st position
            if(i < s.length() - 1 && map.get(s.charAt(i + 1)) > map.get(s.charAt(i))) {
               //subtracting 
                total = total - currentNumInMap;
            }
            else {
                //adding
                total = total + currentNumInMap;            
            }

        }
        return total;
    }
}