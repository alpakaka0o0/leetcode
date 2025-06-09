class Solution(object):
    def ladderLength(self, beginWord, endWord, wordList):
        """
        :type beginWord: str
        :type endWord: str
        :type wordList: List[str]
        :rtype: int
        """
        
        s= set(wordList)
        
        if endWord not in s and endWord != beginWord:
            return 0

        word_cnt = len(beginWord)
        
        q = collections.deque([(beginWord, 0)])
        
        v = {beginWord}
        alphabet =  "abcdefghijklmnopqrstuvwxyz"
        while q:
            
            word, cnt = q.popleft()
            print(word, cnt)
            if word == endWord:
                return cnt+1

            for i in range(word_cnt):
                for alpha in alphabet:
                    if  word[i] != alpha:
                        n_word = word[:i] + alpha + word[i+1:]
                        if n_word in s and n_word not in v:
                            v.add(n_word)
                            q.append((n_word, cnt+1))

        return 0         
