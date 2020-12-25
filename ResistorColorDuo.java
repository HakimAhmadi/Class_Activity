public class ResistorColorDuo {

    public ResistorColorDuo() {
    }

    public int value(String[] values){

        StringBuilder val= new StringBuilder();

        for (String s:values){
            switch (s.toLowerCase()) {
                case "black" -> val.append(0);
                case "brown" -> val.append(1);
                case "red" -> val.append(2);
                case "orange" -> val.append(3);
                case "yellow" -> val.append(4);
                case "green" -> val.append(5);
                case "blue" -> val.append(6);
                case "violet" -> val.append(7);
                case "grey" -> val.append(8);
                case "white" -> val.append(9);
            }
        }
        return Integer.parseInt(val.toString().substring(0,3));
    }
}
