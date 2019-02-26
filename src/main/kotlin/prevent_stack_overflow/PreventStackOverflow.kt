package prevent_stack_overflow

import java.util.*

tailrec fun loop(random: Random, int: Int): Int {
    return if (int <= 0) random.nextInt()
    else {
        random.nextInt()
        loop(random, int - 1)
    }
}