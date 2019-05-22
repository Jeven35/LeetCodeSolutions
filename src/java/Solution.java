package java;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jeven on 2019/5/22.
 */
public class Solution {


    /**
     * 3.无重复字符的最长子串
     * 思路：滑动窗口
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap();
        int left = 0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                left = Math.max(left,map.get(c)+1);
            }
            map.put(c,i);
            max = Math.max(max,i+1-left);
        }
        return max;
    }
}
