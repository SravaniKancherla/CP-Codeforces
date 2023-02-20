# CP-Codeforces

Problem Link :  https://codeforces.com/contest/1428/problem/C

Problem Statment :

Zookeeper is playing a game. In this game, Zookeeper must use bombs to bomb a string that consists of letters 'A' and 'B'. He can use bombs to bomb a substring 
which is either "AB" or "BB". When he bombs such a substring, the substring gets deleted from the string and the remaining parts of the string get concatenated.

For example, Zookeeper can use two such operations: AABABBA →
 AABBA →
 AAA.

Zookeeper wonders what the shortest string he can make is. Can you help him find the length of the shortest string?

My Approach1: 
 I tried first by removing all  AB's then again travel one more time if any new AB's formed because of removal of earlier AB's then it will remove.
 It will continue until all ABs got removed and then travel again to remove all BBS.
	 * This worked but got TLE
   
 My Approach 2:
 Here I used stack data structure as Stack follows LIFO order,  because whenever you encounter character "B" you must  remove previous character
which is newly added, even if it is "A" or "B,, because you have to remove all "BBs" and all "ABs." We have to follow either of the below 3 steps for every character.
while looping over String:
1. If the stack is empty or if I get "A" then push the character into the stack.
2. If it is B and the stack is not empty, pop the character so that it removes the recently inserted character, which forms either BB or AB. Anything is fine.
3. If we encounter B again, it will pop, deleting any newly formed AB or BB due to the deletion of the previous one. 
