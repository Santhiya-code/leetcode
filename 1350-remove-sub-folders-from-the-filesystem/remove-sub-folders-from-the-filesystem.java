import java.util.*;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder); // Sort folder list
        List<String> result = new ArrayList<>();
        String prev = "";

        for (String path : folder) {
            if (prev.equals("") || !path.startsWith(prev + "/")) {
                result.add(path);
                prev = path;
            }
        }
        return result;
    }
}
