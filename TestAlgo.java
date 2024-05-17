public class TestAlgo{
    public static void main(String[] args){
        String html = "<p><span>";
        String html1= "<p><span></span></p>";
        int[] exp4 = {1,2,8,60};
        experience(exp4);
    }
    
    public static boolean isValidHtml1(String html){
        boolean baliseOvert = false;
        boolean baliseFermer = false;
        boolean dansBalise = false;
        if(html != null || !html.isEmpty()){
            for(int i = 0; i < html.length(); i++){
                char charActuel = html.charAt(i);
                if(charActuel == '<' && html.charAt(i+1) != '!' && html.charAt(i+1) != '/' && html.charAt(i+1) != '?'){
                    dansBalise = true;
                    baliseOvert = true;
                }
                if(dansBalise){
                    if(charActuel == '>'){
                        baliseFermer = true;
                    }
                }
            }
            return baliseOvert && baliseFermer;
        }{
            return false;
        }
    }
}