// 뒤집힌 문자열

class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
//         for(i in my_string.length - 1 downTo 0){
//             answer += my_string[i]
//         }
        
        // XXXXXXXXXXXXXXXXXX
        // for(i in my_string.indices - 1 downTo 0){
        //     answer += my_string[i]
        // } 이렇게는 불가
        
        my_string.toCharArray().forEach(){
            i -> answer = i + answer
        }
        
        return answer
    }
}

// class Solution {
//     fun solution(my_string: String): String {
//         var answer: String = ""
                
//         return my_string.reversed()
//     }
// }
