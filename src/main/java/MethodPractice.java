import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MethodPractice {

    public MethodPractice(){

    }

    // 練習問題 6 - 1
    /**
     * 整数の 2 乗を計算するメソッドを作成しなさい。１つの int 型引数を取り、結果を int 型の戻り値として返すこと。
     *
     * また、メソッドの動作を検証できるようにプログラムを作成しなさい。
     */
    int pow(int value){
        return value * value;
    }

    // 練習問題 6 - 2
    /**
     * ２つの整数の平均を計算するメソッドを作成しなさい。２つの int 型引数を取り、結果を int 型の戻り値として返すこと。
     *
     * また、メソッドの動作を検証できるようにプログラムを作成しなさい。
     *
     * ※ 	平均の計算は整数で行い、小数点以下は切り捨ててよい。
     */
    int average(int... values){
        return (int)Arrays.stream(values).average().getAsDouble();
    }

    // 練習問題 6 - 3
    /**
     * ２つの整数の大きい方を選ぶメソッドを作成しなさい。２つの int 型引数を取り、大きい方の数値を戻り値として返すこと。
     * また、このメソッドを使用して、int 型の変数 x、y、z にそれぞれ数値を入力し、最も大きい数値を表示するプログラムを作成しなさい。
     */
    int compare(int a, int b){
        return a > b ? a : b;
    }

    // 練習問題 6 - 4
    /**
     * サイズを示す数値（int）を引数とし、何等かの文字で例のような三角形を表示するメソッドを作成しなさい。
     *
     * また、このメソッドを使用してサイズ 3、4、5 の３つの三角形を表示するプログラムを作成しなさい。
     */
    void displayTriangle(int size){
        displayTriangle(size, '$');
    }


    // 練習問題 6 - 5
    /**
     * サイズを示す数値と、表示する文字を引数とし、三角形を表示するメソッドを作成しなさい。
     *
     * このメソッドを使用して、サイズと文字の異なる３つの三角形を表示しなさい。
     *
     * ※ 	サイズを示す引数は int 型、表示する文字の引数は char 型にする。
     */
    void displayTriangle(int size, char ch){
        IntStream.rangeClosed(1, size)
                .forEach(x -> {
                    IntStream.rangeClosed(1, x)
                            .forEach( y -> System.out.print(ch));
                    System.out.println();
                });
    }

    // 練習問題 6 - 6
    /**
     * 九九のひとつの段を表示するメソッドを作成しなさい。何の段（ 1 ～ 9 ）であるかを引数とします。
     *
     * このメソッドを使用して、九九表を作成しなさい。
     */
    void displayMultiplicationTable(int value){
        System.out.print(IntStream.rangeClosed(1, 9)
                .mapToObj(x -> String.valueOf(x * value))
                .collect(Collectors.joining(" ")));
    }

    // 練習問題 6 - 7
    /**
     * ある数が素数かどうかを判定するメソッドを作成しなさい。
     *
     * このメソッドを使用して 10000 以上 10100 未満の素数をすべて表示するプログラムを作成しなさい。
     */
    boolean isPrimeNumber(int value){

        if(value <= 3){
            return true;
        }

        for(int i = 2 ; i <= ( value / 2 ) ; i++)
            if( (value % i) == 0 )
                return false;

        return true;
    }

    // 練習問題 6 - 8
    /**
     * 習問題 6 - 8
     * メソッドを再帰的に呼び出すことによって、フィボナッチ数列の n 番目の項を計算するメソッドを作成しなさい。
     *
     * 最初の２つの項、0 番目を 0、1 番目を 1 とします。
     *
     * このメソッドを使用して、11 番目から 20 番目までの項を表示するプログラムを作成しなさい。
     *
     * ※ 	フィボナッチ数列：
     * 　それぞれの項がその直前の２つの項の和になっている数列のこと。
     * 例：0, 1, 1, 2, 3, 5, 8, 13, 21, ...
     */

}
