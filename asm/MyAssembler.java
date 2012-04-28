import java.util.*;
import java.io.*;

class MyAssembler extends Assembler
{

    // The student has to implement it for processing the labels.
    void processLabel(String sourceCode);
	
    // The student has to implement it for generating the machine codes.
    String generateCode(Instruction instruction);
	
    // The student has to implement it for updating the program counter.
    void updateProgramCounter(Instruction instruction);
	
    // The student has to implement it for initializing some of their own variables and data structures.
    void initialization()  throws IOException
	{
	
	}
	
    // The student has to implement it for replacing the labels used in instruction
    void replaceInstructionLabel(Instruction instruction);
	
    // The student has to implement it for replacing the labels used in memory
    void replaceMemoryLabel();
}