## Problem: Contains Duplicate

### 🔍 Description:
Given an integer array `nums`, return `true` if any value appears at least twice, else `false`.

### ✅ Approach:
- Use a `HashSet` to store unique values.
- Loop through each number:
  - If it's already in the set → return `true`
  - Else → add it to the set
- If loop finishes → return `false`

### ⏱️ Time Complexity:
- **O(n)** — because we loop through the array once
- **O(n)** space — for storing values in the set
