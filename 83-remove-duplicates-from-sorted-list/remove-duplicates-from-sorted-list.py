# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: ListNode | None) -> ListNode | None:
        l=head
        while l and l.next:
            if l.val==l.next.val:
                l.next=l.next.next
            else:
                l=l.next
        return head

        