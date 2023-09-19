class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        """
        :type flowerbed: List[int]
        :type n: int
        :rtype: bool
        """
        able_flw = 0
        for i in range(len(flowerbed)):
            if i == 0:
                if len(flowerbed) > 1:
                    if flowerbed[i+1] == 0 and flowerbed[i] == 0:
                        print("foundit in first")
                        flowerbed[i] = 1
                        able_flw += 1
                else:
                    if flowerbed[i] == 0:
                        able_flw+=1
            elif i == len(flowerbed)-1:
                if flowerbed[i-1] == 0 and flowerbed[i]==0:
                    print("foundit in final")
                    flowerbed[i] = 1
                    able_flw += 1
            else:
                if flowerbed[i-1] == 0 and flowerbed[i+1] == 0 and flowerbed[i] == 0:
                    print("foundit")
                    flowerbed[i] = 1
                    able_flw += 1
        print(able_flw)
        if able_flw >= n:
            return True
        else:
            return False
                    
        