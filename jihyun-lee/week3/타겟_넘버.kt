import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        data class State(val index: Int, val sum: Int)
        val queue: Queue<State> = LinkedList()
        var count = 0
        
        // 시작 상태
        queue.add(State(0, 0))
        
        while (queue.isNotEmpty()) {
            val (index, sum) = queue.poll()
            
            if (index == numbers.size) {
                if (sum == target) count++
            } else {
                queue.add(State(index + 1, sum + numbers[index]))
                queue.add(State(index + 1, sum - numbers[index]))
            }
        }
        
        return count
    }
}