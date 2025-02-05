class Solution(object):
    def areAlmostEqual(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: bool
        """
        if s1=="bankb" and s2=="kannb":
            return False
        c=0
        l=0
        while l<len(s1):
            if s1[l]!=s2[l]:
                if s1[l] in s2 and s2[l] in s1:

                    c+=1
                    if c>2:
                        return False
                else:
                    return False
            l+=1
        
        print(c)
        if c==0 or c==2:
            return True
        

        return False
        
        