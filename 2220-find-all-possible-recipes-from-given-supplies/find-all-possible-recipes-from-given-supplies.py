class Solution:
    def findAllRecipes(self, recipes: List[str], ingredients: List[List[str]], supplies: List[str]) -> List[str]:
        can_make = set(supplies)  # Use a set for faster lookups
        ans = []
        for _ in range(len(recipes)):  # Iterate multiple times to handle dependencies
            for i in range(len(recipes)):
                if recipes[i] not in ans:  # Avoid duplicate additions
                    if all(item in can_make for item in ingredients[i]):  # Check if all ingredients are available
                        can_make.add(recipes[i])
                        ans.append(recipes[i])
                        
        return ans
