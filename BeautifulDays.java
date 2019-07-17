// Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {

    int beautifulDays = 0;
        
        for(int x = i; x <= j; x++)
        {
            StringBuilder day = new StringBuilder(String.valueOf(x));
            int xReverse = Integer.parseInt(day.reverse().toString());
                
            if(Math.abs(x-xReverse) % k == 0)
            {
                beautifulDays++;
            }
        }
        System.out.println(beautifulDays);
        return beautifulDays;
    }
