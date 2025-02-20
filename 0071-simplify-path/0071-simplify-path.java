class Solution {
    public String simplifyPath(String path) {
        String[] directories = path.split("/");
        Stack<String> pathStack = new Stack<>();
        String simplify = "";

        for (int i = 0; i < directories.length; i++){
            if (directories[i].equals("..")){
                System.out.println("it dots");
                if (pathStack.size() > 0) {
                    pathStack.pop();
                }
            }else{
                if ((directories[i].length() > 0) && (!directories[i].equals("."))){
                    pathStack.push(directories[i]);
                }
            }
        }

        int size = pathStack.size();
        if (size == 0){
            simplify = "/";
        }
        for (int i = 0; i < size; i++){
            simplify = "/" + pathStack.pop() + simplify;
        }
        return simplify;
    }
}