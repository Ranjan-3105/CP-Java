// this template can be used for basically all recursion problems.
/*


Problems like : 
- Combination Sum
- Combination Sum II
- Subsets
- Permutations
- Palindrome Partitioning
- N-Queens
- Word Search


 */

// code : 

void backtrack(int start, List<Integer> path){

    if(base_condition){
        result.add(new ArrayList<>(path));
        return;
    }

    for(int i = start; i < n; i++){

        // pruning condition (optional)             if(target < i or something like that) break;

        path.add(choice[i]);     // choose
        backtrack(next_state);   // explore
        path.remove(path.size()-1); // undo
    }
}