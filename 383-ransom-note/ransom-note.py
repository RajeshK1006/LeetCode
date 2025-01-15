class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        mapp = {}
        for i in range(len(ransomNote)):
            if ransomNote[i] not in mapp:
                mapp[ransomNote[i]] = 1
            else:
                mapp[ransomNote[i]] +=1 
        
        for i in range(len(magazine)):
            if magazine[i] in mapp:
                mapp[magazine[i]] -= 1

                if mapp[magazine[i]] ==0:
                    del mapp[magazine[i]]
                

                if not mapp:
                    return True
        
        return len(mapp)==0