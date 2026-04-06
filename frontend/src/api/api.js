const API_BASE_URL = `${import.meta.env.VITE_API_URL}/api/health`;

export const fetchRecords = async () => {
    try {
        const response = await fetch(`${API_BASE_URL}/records`);
        if (!response.ok) throw new Error('Failed to fetch records');
        return await response.json();
    } catch (error) {
        console.error('API Error:', error);
        throw error;
    }
};

export const createRecord = async (recordData) => {
    try {
        const response = await fetch(`${API_BASE_URL}/records`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(recordData),
        });
        if (!response.ok) throw new Error('Failed to create record');
        return await response.json();
    } catch (error) {
        console.error('API Error:', error);
        throw error;
    }
};
