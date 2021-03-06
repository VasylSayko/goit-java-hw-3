public class ATM {


            public int countBanknotes(int sum)
        {
            int n=sum;
            int[] Q = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
            int q, x; 
            x=0; //количество купюр,  ему по умолчанию присваивается 0
            for(int i = 0; i < 9; ++i) //цикл перебирает все элементы массива, от большего к меньшему
            {
                q = Q[i];
                x += n / q; //считаем, сколько раз входит купюра в сумму
                n %= q;  //сумме присваивается остаток от деления на данную купюр
            }
            if(n > 0) x = -1; //проверяем наличие остатка, который банкомат не сможет выдать
            return x;
        }
    }
