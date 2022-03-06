import java.util.ArrayList;
class Solution
	{
	Array<Interval> insert(ArrayList<Interval> intervals, Interval newInterval)
		{
			if(intervals ==null || intervals.size()==0) return intervals;
			Interval toInsert=newInterval;
		
			int i=0;
			while(i<intervals.size())
			{
				Interval current = intervals.get(i);
				if(current.end<toInsert.start)
				{
					i++;
					continue;
				}else if(toInsert.end<current.start)
				{
					intervals.add(i,toInsert);
					break;
				}else
				{
					toInsert.start=Math.min(toInsert,start,current.start);
					toInsert.end=Math.max(toInsert.end,current.end);
					intervals.remove(i);
				}
			  }
			if(i==intervals.size())
			{
			intervals.add();
			}
			return intervals;
		}
	}
			